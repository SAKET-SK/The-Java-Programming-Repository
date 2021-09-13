//Program to calculate area and perimeter of rectangle
import java.util.*;
class Rectangle
{
	public static void main(String args[])
	{
		int l,b,a,p;
		System.out.print("Input length and breadth: ");
		Scanner sc=new Scanner(System.in);
		l=sc.nextInt();
		b=sc.nextInt();
		a=l*b;
		p=2*(l+b);
		System.out.println("Area: "+a);
		System.out.println("Perimeter: "+p);
	}
}