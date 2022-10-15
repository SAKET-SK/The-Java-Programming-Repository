// The program outputs a Ball bouncing inside the Output window. Try varying the size of the Output window for dynamic results.

import java.awt.*;
import javax.swing.*;
 
public class BouncingBall extends JPanel {
 
  // Box height and width
  int width;
  int height;
 
  // Ball Size
  float radius = 40; 
  float diameter = radius * 2;
 
  // Center of Call
  float X = radius + 50;
  float Y = radius + 20;
 
  // Direction
  float dx = 3;
  float dy = 3;
 
  public BouncingBall() {
 
    Thread thread = new Thread() {
      public void run() {
        while (true) {
 
          width = getWidth();
          height = getHeight();
 
          X = X + dx ;
          Y = Y + dy;
 
          if (X - radius < 0) {
            dx = -dx; 
            X = radius; 
          } else if (X + radius > width) {
            dx = -dx;
            X = width - radius;
          }
 
          if (Y - radius < 0) {
            dy = -dy;
            Y = radius;
          } else if (Y + radius > height) {
            dy = -dy;
            Y = height - radius;
          }
          repaint();
 
          try {
            Thread.sleep(50);
          } catch (InterruptedException ex) {
          }
 
        }
      }
    };
    thread.start();
  }
 
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.YELLOW);
    g.fillOval((int)(X-radius), (int)(Y-radius), (int)diameter, (int)diameter);
  }
 
  public static void main(String[] args) {
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame("Bouncing Ball");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1000, 1000);
    frame.setContentPane(new BouncingBall());
    frame.setVisible(true);
  }
}
