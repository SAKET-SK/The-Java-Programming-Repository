// Demonstrating ToolTip

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

/* <applet code = "ToolTip" height = 300 width = 100> </applet> */

public class ToolTip extends JApplet
{
    public void init()
    {
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JCheckbox jc = new JCheckbox("Select / Hover over me");
        jc.setToolTipText("This is ToolTip Text");
        cp.add(jc);
    }
}
