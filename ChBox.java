// State change using CheckBox

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code = "ChBox" width = 100 height = 100> </applet> */

public class ChBox extends Applet implements ItemListener
{
    Checkbox cb1,cb2,cb3;
    public void init()
    {
        cb1 = new Checkbox("Java");
        cb2 = new Checkbox("C++");
        cb3 = new Checkbox("Python");
        
        add(cb1);  add(cb2);  add(cb3);
        
        cb1.addActionListener(this);
        cb2.addActionListener(this);
        cb3.addActionListener(this);
    }
    
    public void itemStateChanged(ItemEvent e)
    {
        repaint();
    }
    
    public void paint()
    {
        g.drawString("Java : " + cb1.getState(), 100,100);     // If cb is ticked, getState() returns true, or else false
        g.drawString("C++ : " + cb2.getState(), 100,200);
        g.drawString("Python : " + cb3.getState(), 100,300);
    }
}
