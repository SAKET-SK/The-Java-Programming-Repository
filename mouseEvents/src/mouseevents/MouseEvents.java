package mouseevents;
/*@author Saket*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public abstract class MouseEvents extends Applet implements MouseListener
{
    public void init()
    {
        addMouseListener(this);
    }
    public void paint(Graphics g)
    {
        this.setBackground(Color.WHITE);
    }
    public void mouseEntered(MouseEvent me)
    {
        this.setBackground(Color.red);
    }
    public void mouseExited(MouseEvent me)
    {
        this.setBackground(Color.GREEN);
    }
    public void mousePressed(MouseEvent me)
    {
        this.setBackground(Color.CYAN);
    }
    public void mouseRelesed(MouseEvent me)
    {
        this.setBackground(Color.BLUE);
    }
    public void mouseClicked(MouseEvent me)
    {
        this.setBackground(Color.YELLOW);
    }
}
