//Reversing a number
import java.lang.*;   //This package is imported by default. No error occurs if we skip this line
import java.util.*;
class ReverseNo
{
	public static void main(String args[])
	{
		int num,rev=0,rem;
		System.out.print("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse: "+rev);
	}
}