// A program showing vector operations

import java.util.*;
class VectorDemo1
{
    public static void main(String args[])
    {
        Vector v = new Vector();
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(40);
        
        System.out.println("Elements = " + v.size());
        
        v.insertElementAt(new Integer(70),2);
        
        System.out.println("Elements = " + v.size());
        
        v.removeElementAt(3);
        v.removeElement(new Integer(40));
        
        System.out.println("Elements = " + v.size());
    }
}
