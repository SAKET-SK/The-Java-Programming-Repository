// Input a number, output a result. 3 checkboxes, square,cube,quad. Return the relevant result

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code = "CBCalc" width = 100 height = 100> </applet> */

public class CBCalc extends Applet implements ActionListener
{
    Checkbox cb1,cb2,cb3;
    Label l1,l2;
    TextFields t1,t2;
    
    public void init()
    {
        cb1 = new Checkbox("Power of 2 (SQUARE) : ");
        cb2 = new Checkbox("Power of 3 (CUBE) : ");
        cb3 = new Checkbox("Power of 4 (QUAD) : ");
        
        l1 = new Label("Number : ");
        l2 = new Label("Result : ");
        
        add(l1);  add(t1);
        add(l2);  add(t2);
        add(cb1);  add(cb2);  add(cb3);
        
        cb1.addActionListener(this);
        cb2.addActionListener(this);
        cb3.addActionListener(this);
    }
    
    public void itemStateChanged(ItemEvent e)
    {
        int n = Integer.parseInt(t1.getText());
        int res = 0;
        
        if(cb1.getState())
        {
            res = n * n;
        }
        else if(cb2.getState())
        {
            res = n * n * n;
        }
        else if(cb3.getState())
        {
            res = n * n * n * n;
        }
        
        t2.setText(" " + res);
    }
}
