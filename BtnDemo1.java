//To demonstrate addition function using Button
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="BtnDemo1" width=100 height=100></applet>*/
public class BtnDemo1 extends Applet implements ActionListener
{
	TextField t1,t2,t3;
	Button b;
	public void init()
	{
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		b=new Button("Add");
		
		add(t1);
		add(t2);
		add(t3);
		add(b);
		
		b.addActionListener(this);      //registration
	}
	public void actionPerformed(ActionEvent ae)
	{
		int n1=Integer.parseInt(t1.getText());
		int n2=Integer.parseInt(t2.getText());
		int rs=n1+n2;
		t3.setText(" " +rs);
	}
}