// Input font details and output the result

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code = "FontStyle" width = "300" height = "300"> </applet> */

public class FontStyle extends Applet implements ActionListener
{
    TextField t1,t2,t3;
    Label l1,l2,l3;
    Button b;
    Font f;
    
    public void init()
    {
        l1 = new Label("Font Name: ");
        l2 = new Label("Font Size: ");
        l3 = new Label("Font Style: ");         // Input Integer in this field. 0 -> plain, 1 -> bold, 2-> italic, 3-> bold + italic
        
        t1 = new TextField(30);
        t2 = new TextField(30);
        t3 = new TextField(30);
        
        b = new Button("Show");
        
        add(l1);    add(t1);
        add(l2);    add(t2);
        add(l3);    add(t3);
        add(b);
        b.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
       String nm = t1.getText();
       int sz = Integer.parseInt(t2.getText());
       int st = Integer.parseInt(t3.getText());
       f = new Font(nm,sz,st);
       repaint();
    }
    public void paint(Graphics g)
    {
        g.setFont(f);
        g.drawString("Demo String",100,200);
    }
}
