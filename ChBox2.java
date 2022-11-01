// State change using Checkbox - 2

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code = "ChBox2" height = 300 width = 300> </applet> */

public class ChBox2 extends Applet implements ItemListener
{
    Label l1.l2;
    TextField t1,t2;
    Checkbox cb1,cb2,cb3;
    CheckboxGroup cbg;
    
    public void init()
    {
        cbg = new CheckboxGroup();
        cb1 = new Checkbox("Square",cbg,false);
        cb2 = new Checkbox("Cube",cbg,false);
        cb3 = new Checkbox("Quad",cbg,false);
        
        t1 = new TextField(10);
        t2 = new TextField(10);
        
        l1 = new Label("Number");
        l2 = new Label("Result");
        
        add(l1);    add(t1);
        add(l2);    add(t2);
        add(cb1);  add(cb2);  add(cb3);
        
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
    }
    
    public void itemState(ItemEvent e)
    {
        int n = Integer.parseInt(t1.getText());
        int res = 0;
        Checkbox c = cbg.getSelectedCheckbox();
        
        if(c == cb1)
        {
            res = n * n;
        }
        else if(c == cb2)
        {
            res = n * n * n;
        }
        else if(c == cb3)
        {
            res = n * n * n * n;
        }
        
        t2.setText(" ", + res);
    }
}
