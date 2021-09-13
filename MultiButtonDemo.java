import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="MultiButtonDemo" width=100 height=100></applet>*/
public class MultiButtonDemo extends Applet implements ActionListener
{
	TextField t1,t2,t3;
	Label l1,l2,l3;
	Button b1,b2;
	public void init()
	{
		l1=new Label("First No");
		l2=new Label("Second No");
		l3=new Label("Result");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		b1=new Button("Greatest");
		b2=new Button("Smallest");
		add(l1);		add(t1);
		add(l2);		add(t2);
		add(l3);		add(t3);
		add(b1);		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int n1=Integer.parseInt(t1.getText());
		int n2=Integer.parseInt(t2.getText());
		int r=0;
		String s=ae.getActionCommand();
		if(s=="Greatest")
		{
			if(n1>n2)
				r=n1;
			else
				r=n2;
		}
		else if(s=="Smallest")
		{
			if(n1>n2)
				r=n2;
			else
				r=n1;
		}
		t3.setText(""+r);
	}
}