// Java Applet to draw Indian Flag

import java.awt.*;
import java.applet.*;

/* <applet code="AppletIndianFlag" width="100" height="100">
</applet> */

public class AppletIndianFlag extends Applet
{
    public void paint(Graphics g)
    {
        g.drawRect(75,100,25,500);
        g.drawLine(50,600,185,600);
        g.setColor(Color.orange);
        g.fillRect(100,100,200,50);
        g.setColor(Color.black);
        g.drawRect(100,150,200,50);
        g.setColor(Color.green);
        g.fillRect(100,200,200,50);
        g.setColor(Color.black);
        g.drawOval(175,150,50,50);   // Ashok Chakra
        g.setColor(Color.blue);
        g.drawLine(200,150,200,200);
        g.drawLine(190,160,210,190);
        g.drawLine(175,150,225,150);
        g.drawLine(190,190,215,140); 
    }
}
