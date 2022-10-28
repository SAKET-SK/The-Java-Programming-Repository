// A Program to demonstrate all Mouse and Keyboard Events

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code = "MouseKeyboardEvents" width = 700 height = 700> </applet> */

public class MouseKeyboardEvents extends Applet implements MouseListener, MouseMotionListener, KeyListener
{
    String msg = " ";
    String kmsg = " ";
    int x = 50, y = 50;
    
    public void init()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
        addKeyListener(this);
    }
    
    public void mouseClicked(MouseEvent m)
    {
        msg = "Mouse is Clicked!!";
        x = m.getX();
        y = m.getY();
        repaint();
    }
    
    public void mousePressed(MouseEvent m)
    {
        msg = "Mouse is Pressed!!";
        x = m.getX();
        y = m.getY();
        repaint();
    }
 
    public void mouseEntered(MouseEvent m)
    {
        msg = "Mouse has entered inside!!";
        repaint();
    }
 
    public void mouseReleased(MouseEvent m)
    {
        msg = "Mouse has been released!!";
        x = m.getX();
        y = m.getY();
        repaint();
    }
 
    public void mouseExited(MouseEvent m)
    {
        msg = "Mouse has exited!!";
        repaint();
    }
 
    public void mouseMoved(MouseEvent m)
    {
        msg = "#####";
        x = m.getX();
        y = m.getY();
        repaint();
    }
 
    public void mouseDragged(MouseEvent m)
    {
        msg = "$$$$$";
        x = m.getX();
        y = m.getY();
        repaint();
    }
    
    public void keyPressed(KeyEvent k)
    {
        showStatus("Key is pressed");
    }
    
    public void keyReleased(KeyEvent k)
    {
        showStatus("Key is released");
    }
    
    public void keyTyped(KeyEvent k)
    {
        kmsg = kmsg + k.getKeyChar();
        repaint();
    }
    
    public void paint(Graphics g)
    {
        g.drawString(msg,x,y);
        g.drawString(kmsg,100,100);
    }
}
