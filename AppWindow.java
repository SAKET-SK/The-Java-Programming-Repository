import java.awt.*;
import java.awt.event.*;
import java.applet;

/* <applet code = "AppWindow" height = 300 width = 300> </applet> */

public class AppWindow extends Frame implements MouseListener
{
    String msg = " ";
    public AppWindow()
    {
        addMouseListener(this);
        addWindowListener(new MyWindowAdapter());
    }
    
    public void paint(Graphics g)
    {
        g.drawString(msg,40,40);
    }
    
    public void mousePressed(MouseEvent me)
    {
        msg = "Mouse is pressed";
        repaint();
    }
    
    public void mouseReleased(MouseEvent me)
    {
        msg = "Mouse is released";
        repaint();
    }
    
    public void mouseEntered(MouseEvent me)
    {
        msg = "Mouse entered the screen";
        repaint();
    }
    
    public void mouseExited(MouseEvent me)
    {
        msg = "Mouse exited the screen";
        repaint();
    }
    
    public void mouseClicked(MouseEvent me)
    {
        msg = "Mouse is clicked";
        repaint();
    }
    
    class MyWinAdapter extends WindowAdapter
    {
        public void Window(toString(WindowEvent we))
        {
            System.exit(0);
        }
    }
    
    public static void main(String args[])
    {
        AppWindow aw = new AppWindow();
        aw.getSize(100,100);
        aw.setTitle("AWT based Application");
        aw.setVisible(true);
    }
}
