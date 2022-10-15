// A program like calcualtor, we make choice of which operation to perform on two numbers

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="ChoiceDemo" width=100 height=100></applet>*/
public class ChoiceDemo extends Applet implements ItemListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Choice c;
	int rs;
	public void init()
	{
		c=new Choice();
		c.add("Addition");
		c.add("Subtraction");
		c.add("Multiplication");
		c.add("Division");
		c.add("Modulo Division");
		l1=new Label("Number 1");
		l2=new Label("Number 2");
		l3=new Label("Result");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		add(l1);		add(t1);
		add(l2);		add(t2);
		add(c);
		add(l3);		add(t3);
		c.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		int n1=Integer.parseInt(t1.getText());
		int n2=Integer.parseInt(t2.getText());
		rs=0;
		int idx=c.getSelectedIndex();
		if(idx==0)
			rs=n1+n2;
		else if(idx==1)
			rs=n1-n2;
		else if(idx==2)
			rs=n1*n2;
		else if(idx==3)
			rs=n1/n2;
		else if(idx==4)
			rs=n1%n2;
		
		t3.setText(""+rs);
	}
}
