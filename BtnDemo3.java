//To find greatest of two numbers using button
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="BtnDemo3" width=100 height=100></applet>*/
public class BtnDemo3 extends Applet implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b;
	public void init()
	{
		l1=new Label("Number 1");
		l2=new Label("Number 2");
		l3=new Label("Greatest of two");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		b=new Button("Find greatest");
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
		int n1=Integer.parseInt(t1.getText());
		int n2=Integer.parseInt(t2.getText());
		int gr_no;
		if(n1>n2)
			gr_no=n1;
		else
			gr_no=n2;
		t3.setText(""+gr_no);
	}
}