package guiframe;
/* @author Saket*/
import java.awt.*;
import java.awt.event.*;
public class GUIFRAME extends Frame implements ActionListener
{
       Label l1,l2,l3,l4;
       TextField t1,t2,t3;
       Button b1,b2,b3,b4,b5,b6;
       public GUIFRAME(String title)
       {
           super(title);
           this.setLayout(null);
           this.setSize(1200,800);
           this.setBackground(Color.cyan);
           Font f= new Font("arial",Font.BOLD,20);
           
           l1=new Label("Arithmetic Operations");
           l2=new Label("Enter first No:");
           l3=new Label("Enter second No:");
           l4=new Label("Result");
           
           t1=new TextField();
           t2=new TextField();
           t3=new TextField();
           
           b1=new Button("ADD");
           b2=new Button("SUB");
           b3=new Button("MUL");
           b4=new Button("DIV");
           b5=new Button("REFRSH");
           b6=new Button("CLOSE");
           
           l1.setFont(f);
           l2.setFont(f);
           l3.setFont(f);
           l4.setFont(f);
           
           t1.setFont(f);
           t2.setFont(f);
           t3.setFont(f);
           
           b1.setFont(f);
           b2.setFont(f);
           b3.setFont(f);
           b4.setFont(f);
           b5.setFont(f);
           b6.setFont(f);
           
           l1.setForeground(Color.RED);
           l2.setForeground(Color.RED);
           l3.setForeground(Color.RED);
           l4.setForeground(Color.RED);
           
           t1.setForeground(Color.RED);
           t2.setForeground(Color.RED);
           t3.setForeground(Color.RED);
           
           b1.setForeground(Color.RED);
           b2.setForeground(Color.RED);
           b3.setForeground(Color.RED);
           b4.setForeground(Color.RED);
           b5.setForeground(Color.RED);
           b6.setForeground(Color.RED);
           
           b6.setBounds(500,50,200,30);
           l1.setBounds(400,100,300,30);
           l2.setBounds(200,200,200,30);
           t1.setBounds(400,300,200,30);
           l3.setBounds(200,300,200,30);
           t2.setBounds(450,200,200,30);
           l4.setBounds(200,400,200,30);
           t3.setBounds(450,400,200,30);
           b1.setBounds(200,500,100,30);
           b2.setBounds(350,500,100,30);
           b3.setBounds(500,500,100,30);
           b4.setBounds(650,500,100,30);
           b5.setBounds(800,500,100,30);
           
           this.add(l1);
           this.add(l2);
           this.add(l3);
           this.add(l4);
           this.add(t1);
           this.add(t2);
           this.add(t3);
           
           b1.addActionListener(this);
           b2.addActionListener(this);
           b3.addActionListener(this);
           b4.addActionListener(this);
           b5.addActionListener(this);
           b6.addActionListener(this);
           
           this.add(b1);
           this.add(b2);
           this.add(b3);
           this.add(b4);
           this.add(b5);
           this.add(b6);
           
           this.setVisible(true);
       }
       public void actionPerformed(ActionEvent ae)
       {
           if(ae.getSource()==b1)
           {
               int a=Integer.parseInt(t1.getText().toString());
               int b=Integer.parseInt(t2.getText().toString());
               int c=a+b;
               t3.setText(c+" ");
           }
           else if(ae.getSource()==b2)
           {
               int a=Integer.parseInt(t1.getText().toString());
               int b=Integer.parseInt(t2.getText().toString());
               int c=a-b;
               t3.setText(c+" ");
           }
           else if(ae.getSource()==b3)
           {
               int a=Integer.parseInt(t1.getText().toString());
               int b=Integer.parseInt(t2.getText().toString());
               int c=a*b;
               t3.setText(c+" ");
           }
           else if(ae.getSource()==b4)
           {
               int a=Integer.parseInt(t1.getText().toString());
               int b=Integer.parseInt(t2.getText().toString());
               int c=a/b;
               t3.setText(c+" ");
           }
           else if(ae.getSource()==b5)
           {
               t1.setText(null);
               t2.setText(null);
               t3.setText(null);
           }
           else if(ae.getSource()==b6)
           {
               System.exit(1);
           }
       }
    public static void main(String[] args) 
    {
        GUIFRAME gf=new GUIFRAME("ARITHMETIC CALCULATOR");
    }
}
