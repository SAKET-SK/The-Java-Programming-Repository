import java.util.*;
import java.io.*;
class AddingElementVect
{
	public static void main(String args[])
	{
		
		
		Vector v=new Vector();
		v.addElement(new Integer(10));
		v.addElement(new Integer(20));
		v.addElement(new Float(1.2));
		v.addElement(new Float(1.3));
		v.addElement(new Character('A'));
		v.addElement(new Character('S'));
		v.addElement(new String("Core"));
		v.addElement(new String("Java"));
		System.out.println(v);

		System.out.println("We will search 20");
		System.out.println("Present or not?"+v.contains(20));
		System.out.println("We will search D");
		System.out.println("Present or not?"+v.contains('D'));
		
		v.removeAllElements();
		System.out.println(v);		
	}
}
	