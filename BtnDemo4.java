//To setbackground color (0-255 values for red, green and blue)using Button
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="BtnDemo4" height=100 width=100></applet>*/
public class BtnDemo4 extends Applet implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b;
	public void init()
	{
		l1=new Label("Red");
		l2=new Label("Green");
		l3=new Label("Blue");
		t1=new TextField(5);
		t2=new TextField(5);
		t3=new TextField(5);
		b=new Button("Show resultant color");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int r=Integer.parseInt(t1.getText());
		int g=Integer.parseInt(t2.getText());
		int b=Integer.parseInt(t3.getText());
		Color c=new Color(r,g,b);
		setBackground(c);
	}
}