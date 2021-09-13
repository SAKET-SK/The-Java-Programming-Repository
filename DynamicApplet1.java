/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicapplet1;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;
       
/**
/**
 *
 * @author AxiomLab29
 */
public class DynamicApplet1 extends Applet implements Runnable{
    int x,y,a,b,m,n,o,p,c,d,e,z,h,i,x1,y1,a1,b1,x2,y2,x3,y3,x4,y4,x5,y5;
    Thread t;
    public void init()
    {
       x=25;
       y=200;
       a=424;
       b=300;
       m=470;
       n=250;
       o=35;
       p=400;
       c=550;
       d=400;
       e=320;
       z=400;
       h=950;
       i=460;
       x1=530;
       y1=280;
       x2=830;
       y2=80;
       x3=900;
       y3=150;
       x4=970;
       y4= 150;
              
        t=new Thread(this);
        t.start();
    }
    public void paint(Graphics g)
    {
        this.setBackground(Color.CYAN);
         g.setColor(Color.green);
        g.fillOval(x2, y2, 200, 200);
        g.fillOval(x3, y3, 200, 200);
        g.fillOval(x4, y4, 200, 200);
       // g.setColor(Color.ORANGE);
       // g.fillRect(x5, y5, 20, 100);
        g.setColor(Color.darkGray);
        g.fillRect(x, y, 400, 200);
        g.drawRect(x, y, 400, 200);

        g.setColor(Color.gray);
        g.fillRect(a, b, 50,100 );
        g.setColor(Color.darkGray);
        g.fillRect(m, n, 200,170 );
        g.setColor(Color.black);
        g.fillOval(o, p, 70, 70);
        g.fillOval(c, d, 70, 70);
        g.fillOval(e, z, 70, 70);
        g.setColor(Color.RED);
        
        g.fillRect(20, 460, 1500, 10);
        
        g.setColor(Color.orange);
        g.fillOval(1500,50,100,100);
       // g.setColor(Color.BLUE);
        //g.fillRect(x1,y1,100,70);
        Font f=new Font("arial",Font.BOLD,33);
        g.setFont(f);
        
        g.setColor(Color.MAGENTA);
        g.drawString("Created by:-",100,100);
        g.drawString("RHUTIK.N & SAKET.K",100,150);
       
       
    }
    public void run()
    {
       try
        {
            while(true)
            {
                if(x>600& a>600 & m>600 & o>600 & c>600 & e>600  )
                {
                    x=25;
                    a=424;
                    m=470;
                    o=35;
                    c=550;
                    e=320;       
                }
                if(x1>900  & x2<50 & x3<50 & x4<50)
                {
                    
                    x1=530;
                    x2=830;
                    x3=900;
                    x4=970;
                    
                    
                }
               
                x+=30;
                a+=30;
                m+=30;
                x1+=30; 
                o+=30;
                c+=30;
                e+=30;
                x1-=30;
                x2-=30;
                x3-=30;
                x4-=30;
                Thread.sleep(90);
                repaint();
            }
        } 
        catch(Exception e)
        {
            System.out.println(e);
         }
    }
}

    


  