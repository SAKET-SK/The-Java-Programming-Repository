import java.util.*;
class VDemo
{
	public static void main(String args[])
	{
		Vector obj=new Vector(4,2);
		obj.addElement(new Integer(3));
		obj.addElement(new Integer(2));
		obj.addElement(new Integer(5));
		obj.insertElementAt(new Integer(8),2);
		System.out.println(obj);
	}
}