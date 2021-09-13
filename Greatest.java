//A program to determine greatest of three numbers
import java.lang.*;  //Import package= Collection of classes
import java.util.*;   //Utility package
class Greatest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);     //Create an object of class Scanner
		System.out.print("Enter First Number: ");
		int a=sc.nextInt();
		System.out.print("Enter Second Number: ");
		int b=sc.nextInt();
		System.out.print("Enter Third Number: ");
		int c=sc.nextInt();
	//Code to determine greatest
		if(a>b & a>c)
		System.out.println(a+" is greatest");
		else if(b>a & b>c)
		System.out.println(b+" is greatest");
		else
		System.out.println(c+" is greatest");
	//Code to determine lowest
		if(a<b & a<c)
		System.out.println(a+" is lowest");
		else if(b<a & b<c)
		System.out.println(b+" is lowest");
		else
		System.out.println(c+" is lowest");
	}
}

		
		