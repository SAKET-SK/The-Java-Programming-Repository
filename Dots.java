package dots;
/* @author Saket*/
import java.applet.*;
import java.awt.*;
public class Dots extends Applet implements Runnable
{
    Thread t;
    public void init()
    {
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        try
        {
            while(true)
            {
                repaint();
                Thread.sleep(700);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void update(Graphics g)
    {
        Dimension d=getSize();
        int x=(int)(Math.random()*d.width);
        int y=(int)(Math.random()*d.height);
        g.fillOval(x,y,50,50);
    }
}
