// Demonstration of JScrollPane

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

/* <applet code = "JScrP" width = 100 height = 100> </applet> */

public class JScrP extends JApplet
{
    public void init()
    {
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(20,20));
        int b = 1;
        
        for(int i = 0; i <=20; i++)
        {
            for(int j = 0; j <=20; j++)
            {
                jp.add(new JButton("Button" +b));
                ++b;
            }
        }
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane jsp = new JScrollPane(jp,v,h);
        cp.add(jsp,BorderLayout.CENTER);
    }
}
