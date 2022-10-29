// Program to Demonstrate BorderLayout

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code = "BDLayoutDemo" width = 100 height = 100 ><>/applet> */

public class BDLayoutDemo extends Applet
{
    public void init()
    {
        setLayout(new BorderLayout());
        String msg = "AAAAA" + "\nBBBBB" + "\nCCCCC";
        add(new Button ("Button 1"), BorderLayout.NORTH);
        add(new Button ("Button 2"),BorderLayout.SOUTH);
        add(new Button ("Label 1"), BorderLayout.EAST);
        add(new Button ("Lable 2"), BorderLayout.WEST);
        add(new TextArea ( msg, 6, 30), BorderLayout.CENTER);
    }
}
