// Demonstrate JTree

import java.awt.*;
import javax.swing.*;
/*<applet code = "JTreeEvents" width = 300 height = 300> </applet> */

public class JTreeEvents extends JApplet
{
    JTree t;
    JTextField jtf;
    public void init()
    {
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        
        DefaultMutableTreeNode top = DefaultMutableTreeNode("Options");
        
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
        top.add(a);
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
        top.add(a1);
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
        top.add(a2);
        
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
        top.add(b);
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
        top.add(b1);
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
        top.add(b2);
        DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("B3");
        top.add(b3);
        
        t = new JTree(top);
        
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        
        JScrollPane jsp = new JScrollPane(t,v,h);
        cp.add(jsp,BorderLayout.CENTER);
        
        jtf = new JTextField(20);
        
        cp.add(jtf,BorderLayout.SOUTH);
        
        t.addMouseListener(new MouseAdapter()
        {
           public void mouseClicked(MouseEvent me)
           {
                TreePath tp = t.getPathLocation(me.getX(),me.getY());
                if(tp==null)
                {
                    jtf.setText("Clicked Ouside the Tree");
                }
                else
                {
                    jtf.setText(tp.toString());
                }
           }
        });
    }
}
