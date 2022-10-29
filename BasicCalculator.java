// A basic calculator

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet = "BasicCalculator" width = 100 height = 100> </applet> */

public class BasicCalculator extends Applet implements ActionListener
{
    TextField t1,t2,t3;
    Label l1,l2,l3;
    Button b1,b2,b3,b4;
    
    public void init()
    {
        l1 = new Label ("First Number : ");
        l2 = new Label ("Second Number : ");
        l3 = new Label ("Result : ");
        
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);
        
        b1 = new Button("Add");
        b2 = new Button("Sub");
        b3 = new Button("Mul");
        b4 = new Button("Div");
        
        add(l1);    add(t1);
        add(l2);    add(t2);
        add(l3);    add(t3);
        add(b1);  add(b2);  add(b3);  add(b4);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        int res = 0;
        
        String s = ae.getActionCommand();
        
        if(s=="Add")
        {
            res = n1 + n2;
        }
        if(s=="Sub")
        {
            res = n1 - n2;
        }
        if(s=="Mul")
        {
            res = n1 * n2;
        }
        if(s=="Div")
        {
            res = n1 / n2;
        }
        
        t3.setText(" "+ res);
    }
}
