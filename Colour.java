// Program to generate any random color using R G B parameters using Applet Param Tag

import java.awt.*;
import java.applet.*;

/*<applet code = "Colour" width = "100" height = "100">
<param name = "rd" value = "95">
<param name = "gr" value = "120">
<param name = "bl" value = "180">
</applet>*/

// Values of R G B should range between 0 - 255

public class Colour extends Applet
{
    public void init()
    {
        int r = Integer.parseInt(getParameter("rd"));
        int g = Integer.parseInt(getParameter("gr"));
        int b = Integer.parseInt(getParameter("bl"));
        
        Color c = new Color(r,g,b);
        setBackground(c);
    }
}
