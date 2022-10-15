// A counter application, a NetBeans project  
package counter;
/*@author Saket*/
import java.applet.*;
import java.awt.*;
public class Counter extends Applet implements Runnable
{
    int count;
    Thread t;
    public void init()
    {
        count=0;
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
                Thread.sleep(1000);
                ++count;
            }
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    public void paint(Graphics g)
    {
        g.setFont(new Font("serif",Font.BOLD,36));
        FontMetrics fm=g.getFontMetrics();
        String str=" "+count;
        Dimension d=getSize();
        int x=d.width/2-fm.stringWidth(str)/2;
        g.drawString(str,x,d.height/2);
    }  
}
