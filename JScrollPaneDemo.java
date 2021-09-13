import java.awt.*;
import javax.swing.*;
/*<applet code="JScrollPaneDemo" width=300 height=250>*/
public class JScrollPaneDemo extends JApplet
{
	public void init()
	{
		Container cp=getContentPane();
		cp.setLayout(new BorderLayout());
		JPanel jp=new JPanel();
		jp.setLayout(new GridLayout(5,5));
		int b=1;
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				jp.add(new JButton("Button"+b));
				++b;
			}
		}
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane jsp=new JScrollPane(jp,v,h);
		cp.add(jsp,BorderLayout.CENTER);
	}
}