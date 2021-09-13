import java.awt.*;
import java.applet.*;
/*<applet code="TrafficSignal" width=100 height=100>
<\applet>*/
public class TrafficSignal extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.yellow);
		g.fillRect(50,50,200,200);
		g.setColor(Color.red);
		g.fillOval(100,100,100,100);
		g.setColor(Color.yellow);
		g.fillOval(100,200,100,100);
		g.setColor(Color.green);
		g.fillOval(100,300,100,100);
		g.setColor(Color.black);
		g.fillRect(125,450,50,200);
		g.drawLine(100,650,200,650);
	}
}