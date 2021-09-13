/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Demonstrating JComboBox
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Axiom Director
 */
public class DemoJComboBox extends JFrame implements ActionListener{
    
    Container cp;
    JComboBox jcb;
    
    public DemoJComboBox(String title)
    {
        super(title);
        this.setSize(1200,800);
        cp=getContentPane();
        cp.setBackground(Color.cyan);
        cp.setLayout(null);
        Font f=new Font("arial",Font.BOLD,20);
        jcb=new JComboBox();
        jcb.setFont(f);
        jcb.setForeground(Color.red);
        jcb.addItem("Select Your City");
        jcb.addItem("Nagpur");
        jcb.addItem("Yeotmal");
        jcb.addItem("Pune");
        jcb.addItem("Mumbai");
        jcb.addItem("Delhi");
        jcb.addActionListener(this);
        jcb.setBounds(400,200,300, 30);
        cp.add(jcb);
        
    this.setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==jcb)
        {
            String str=jcb.getSelectedItem().toString();
            JOptionPane.showMessageDialog(this, str);
        }
    }
    
    
    public static void main(String [] args)
    {
        new DemoJComboBox("Demo JComboBox");
        
    }
}
