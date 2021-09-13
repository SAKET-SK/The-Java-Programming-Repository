//To print digital sum
import java.lang.*;
import java.util.*;
class DigitalSum
{
	public static void main(String args[])
	{
		int num,sum=0,rem;
		System.out.print("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Digital Sum: "+sum);
	}
}