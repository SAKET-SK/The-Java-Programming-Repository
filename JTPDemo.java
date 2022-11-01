// Demonstration of JTabbed Pane

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;

/* <applet code = "JTPDemo" width = 100 height = 100> </applet> */

public class JTPDemo extends JApplet
{
    public void init()
    {
        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("Cities",new CitiesPanel());
        jtp.addTab("Colors",new ColorsPane());
        jtp.addTab("Flavors",new FlavorsPanel());
        getContentPane.add(jtf);
    }
}

class CitiesPanel extends JApplet
{
    public CitiesPanel()
    {
        JButton jb1 = new JButton("New York");
        add(jb1);
        JButton jb2= new JButton("London");
        add(jb2);
        JButton jb1 = new JButton("Tokyo");
        add(jb3);
    }
}

public class ColorsPanel extends JApplet
{
    public ColorsPanel()
    {
        JCheckbox cb1 = new JCheckbox("Red");
        add(cb1);
        JCheckbox cb2= new JCheckbox("Green");
        add(cb2);
        JCheckbox cb3= new JCheckbox("Blue");
        add(cb3);
    }
}

public class FlavorsPanel extends JApplet
{
    public FlavorsPanel()
    {
        JComboBox jcb = new JComboBox();
        jcb.addItem("Vannilla");
        jcb.addItem("Strawberry");
        jcb.addItem("Chocolate");
        add(jcb);
    }
}
