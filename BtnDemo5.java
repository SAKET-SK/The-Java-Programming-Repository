//To find greatest of three numbers using button
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="BtnDemo5" width=100 height=100></applet>*/
public class BtnDemo5 extends Applet implements ActionListener
{
	Label l1,l2,l3,l4;
	TextField t1,t2,t3,t4;
	Button b;
	public void init()
	{
		l1=new Label("Number 1");
		l2=new Label("Number 2");
		l3=new Label("Number 3");
		l4=new Label("Greatest of three");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		t4=new TextField(10);
		b=new Button("Find greatest");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int n1=Integer.parseInt(t1.getText());
		int n2=Integer.parseInt(t2.getText());
		int n3=Integer.parseInt(t3.getText());
		int gr_no;
		if(n1>n2)
		{
			if(n1>n3)
				gr_no=n1;
			else
				gr_no=n3;
		}
		else
		{
			if(n2>n3)
				gr_no=n2;
			else
				gr_no=n3;
		}
		t4.setText(""+gr_no);
	}
}