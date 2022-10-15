/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Demonstrating Swing in JAVA 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


/**
 *
 * @author Saket
 */
public class DemoSwing extends JFrame implements ActionListener{
    // Declaration of GUI Components 
    Container cp; 
    JLabel jlb1,jlb2,jlb3;
    JButton jbt1,jbt2;
    
    // Create a Constructor
    public DemoSwing(String title)
    {
        // Set the properties of Container 
        super(title); 
        this.setSize(1200, 800);
        cp=getContentPane(); // Gets the size of Frame 
        cp.setBackground(Color.cyan);
        cp.setLayout(null);
        LineBorder lb=new LineBorder(Color.red,7);
        TitledBorder tb=new TitledBorder(lb,"Login Window");        
        Font f=new Font("arial",Font.BOLD,20);
        // intialise GUI Components 
        jlb1=new JLabel("Demonstrating Swing ");
        jlb2=new JLabel("");
        jbt1=new JButton("OK");
        jbt2=new JButton("Next");
        jlb3=new JLabel(new ImageIcon("images\\a.png"));
        // Sets the Font
        jlb1.setFont(f);
        jlb2.setFont(f);
        jbt1.setFont(f);
        jbt2.setFont(f);
        // Set the foreground color
        jlb1.setForeground(Color.red);
        jlb2.setForeground(Color.red);
        jbt1.setForeground(Color.red);
        jbt2.setForeground(Color.red);
        
        jbt1.addActionListener(this);
        jbt2.addActionListener(this);
        
        // Set the bounds 
        jlb2.setBorder(tb);
        jlb1.setBounds(100,100,300,30);
        jlb2.setBounds(50,50,1000,700);
        jlb3.setBounds(500,400,200,100);
        jbt1.setBounds(100,300,300,30);
        jbt2.setBounds(450,300,300,30);
        cp.add(jlb1);cp.add(jlb2);cp.add(jbt1);cp.add(jbt2);
        cp.add(jlb3);
        this.setVisible(true);
        
     
    
    
    
    
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==jbt1)
        {
            jlb1.setText("You Clicked an OK Button ");
            
        }
        else if(ae.getSource()==jbt2)
        {
            new MyFrame("Demo Frame");
        }
        
    }
    public static void main(String [] args)
    {
            new DemoSwing("Swing Demo");
    }

    
    
}
