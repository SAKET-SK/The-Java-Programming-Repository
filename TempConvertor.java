import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="TempConvertor" width=100 height=100></applet>*/
public class TempConvertor extends Applet implements ActionListener
{
	TextField t1,t2;
	Label l1,l2;
	Button b;
	public void init()
	{
		l1=new Label("Temp in C");
		l2=new Label("Temp in F");
		t1=new TextField(10);
		t2=new TextField(10);
		b=new Button("Convert");
		add(l1);		add(t1);
		add(l2);		add(t2);
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int c=Integer.parseInt(t1.getText());
		int f=0;
		f=c*(9/5)+32;
		t2.setText(""+f);
	}
}