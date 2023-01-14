// Draw a rectange using parameters passed via Applet

import java.awt,*;
import java.applet.*;

/*<applet code = "DrawRect" width = 100, height = 100>
  <param name = "x" value = "100">
  <param name = "y" value = "100">
  <param name = "width" value = "200">
  <param name = "height" value = "300">
</applet>*/

public class DrawRect extends Applet{
    int x1,y1,w,h;
    public void init(){
        x1 = Integer.parseInt(getParameter("x"));
        y1 = Integer.parseInt(getParameter("y"));
        w = Integer.parseInt(getParameter("width"));
        h = Integer.parseInt(getParameter("height"));
    }
    public void paint(Graphics g){
        g.drawRect(x1,y1,w,h);
    }
}
