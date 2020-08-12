package smile;
/* @author Saket*/
import java.lang.*;
import java.applet.*;
import java.awt.*;
public class Smile extends Applet 
{
    public void paint(Graphics g)
    {
        this.setBackground(Color.cyan);
        Font f=new Font("arial",Font.BOLD,20);
        g.setFont(f);
        g.setColor(Color.YELLOW);
        g.fillOval(100,100,400,400);
        g.setColor(Color.BLACK);
        g.fillOval(180,180,60,60);
        g.fillOval(360,180,60,60);
        g.fillOval(280,280,40,40);
        g.drawArc(235,250,130,180,215,120);
    }
}
