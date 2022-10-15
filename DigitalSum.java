//To print digital sum
import java.lang.*;
import java.util.*;
class DigitalSum
{
	public static void main(String args[])
	{
		int num,sum=0,rem;
		System.out.print("Enter a number: ");   // For example, let the number be 712, expected output, 11
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();      // num = 712
		while(num>0)
		{
			rem=num%10;   // rem = 712 % 10 = 2
			sum=sum+rem;  // initial sum = 0, 0+2 = 2
			num=num/10;   // num = 712 / 10 = 71, 71 greter than 0, so continue with num = 71
		}
		System.out.println("Digital Sum: "+sum);
	}
}
