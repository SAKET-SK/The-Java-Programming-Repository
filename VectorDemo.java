import java.lang.*;
import java.io.*;
import java.util.*;
public class VectorDemo
{
	public static void main(String args[])
	{
		Vector list=new Vector();
		int length=args.length;
		for(int i=0;i<length;i++)
		{
			list.addElement(args[i]);
		}
		int size=list.size();
		String str[]=new String[size];
		list.copyInto(str);
		for(int i=0;i<size;i++)
		{
			System.out.println("Element position "+i+ ":-" +str[i]);
		}
	}
}