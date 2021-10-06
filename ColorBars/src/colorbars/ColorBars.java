package colorbars;
import java.applet.*;
import java.awt.*;
/* @author Saket*/
public class ColorBars extends Applet 
{
    Color colors[]={Color.black,Color.BLUE,Color.cyan,Color.ORANGE,Color.gray,Color.red,Color.MAGENTA,Color.yellow,Color.pink};
    public void paint(Graphics g)
    {
        int deltax=260/colors.length;
        for(int i=0;i<colors.length;i++)
        {
            g.setColor(colors[i]);
            g.fillRect(i*deltax,0,(i+1)*deltax,260);
        }
    }
}
