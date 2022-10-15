// Program to Demonstrate Thread Priority

import java.util.*;

class A extends Thread
{
    public void run()
    {
        for(int i =0; i<=5; i++)
        {
            System.out.println("i = " + i);
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread
{
    public void run()
    {
        for(int j =0; j<=5; j++)
        {
            System.out.println("j = " + j);
        }
        System.out.println("Exit from B");
    }
}

class C extends Thread
{
    public void run()
    {
        for(int k =0; k<=5; k++)
        {
            System.out.println("k = " + k);
        }
        System.out.println("Exit from C");
    }
}

class ThreadPriority 
{
    public static void main(String args[])
    {
        A a = new A();
        B b = new B();
        C c = new C();
        
        a.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(Thread.MIN_PRIORITY);
        c.setPriority(Thread.NORM_PRIORITY);
        
        a.start();
        b.start();
        c.start();
    }
}
