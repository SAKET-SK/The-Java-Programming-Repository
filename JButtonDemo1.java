// To demonstrate Swing component Button

import java.awt.*;
import javax.swing.*;
/*<applet code = "JButtonDemo1" width = 300 height = 300> </applet> */

public class JButtonDemo1 extends JApplet implements ActionListener
{
    JTextField jtf;
    public void init()
    {
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        
        ImageIcon i1 = new ImageIcon("ind.png");     // Download relevant images and put the file names as required
        ImageIcon i2 = new ImageIcon("brz.png");
        ImageIcon i3 = new ImageIcon("eng.png");
        
        JButton jb1 = new Button("India", i1);
        jb1.setRolloverIcon(i2);
        jb1.setPressedIcon(i3);
        jb1.setActionCommand("India is the largest Democracy in the World");
        jb1.setActionListener(this);
        cp.add(jb1);
        
        JButton jb2 = new JButton("Brazil", i2);
        jb2.setActionCommand("Brazil is known for Football");
        jb2.addActionListener(this);
        cp.add(jb2);
        
        JButton jb3 = new JButton("England", i3);
        jb3.setActionCommand("England is known for Cricket");
        jb3.addActionListener(this);
        cp.add(jb3);
        
        jtf = new JTextField(15);
        cp.add(jtf);
    }
    public void actionPerformed(ActionEvent ae)
    {
        jtf.setText(ae.getActionCommand());
    }
}
