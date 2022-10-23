// To change the color of the panel when we click on buttons

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code = "ChangeColor" width = 300 height = 300> </applet> */

public class ChangeColor extends Applet implements ActionListener
{
    Button b1,b2,b3;
    public void init()
    {
        b1 = new Button ("Red");
        b2 = new Button ("Green");
        b3 = new Button ("Blue");
        
        add(b1);
        add(b2);
        add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae)
    {                                                          // Alternate Way
        String s = ae.getActionCommand();                      // Button s = (Button) ae.getSource();
        if(s=="Red")                                           // if(s==b1) {setBackground(Color.red);}
        {                                                      // else if (s==b2) {setBackground(Color.green);}
            setBackground(Color.red);                          // else if (s==b3) {setBackground(Color.blue);}
        }
        else if(s=="Green")
        {
            setBackground(Color.green);
        }
        else if(s=="Blue")
        {
            setBackground(Color.blue);
        }
    }
}
