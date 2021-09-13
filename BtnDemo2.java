//To calculate factorial using Button
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="BtnDemo2" width=100 height=100></applet>*/
public class BtnDemo2 extends Applet implements ActionListener
{
	TextField t1,t2;
	Button b;
	public void init()
	{
		t1=new TextField(10);
		t2=new TextField(10);
		b=new Button("Factorial");
		
		add(t1);
		add(t2);
		add(b);
		
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int n=Integer.parseInt(t1.getText());
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		t2.setText(" "+fact);
	}
}