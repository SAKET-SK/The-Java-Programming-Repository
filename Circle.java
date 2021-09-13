//To calculate area and circumference of circle
import java.util.*;
class Circle
{
	public static void main(String args[])
	{
		final float PI=3.14f;
		float r,a,c;
		System.out.print("Enter radius: ");
		Scanner sc=new Scanner(System.in);
		r=sc.nextFloat();
		a=PI*r*r;
		c=2*PI*r;
		System.out.println("Area: "+a);
		System.out.println("Circumference: "+c);
	}
}
		