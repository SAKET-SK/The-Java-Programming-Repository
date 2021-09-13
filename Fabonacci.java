//To generate Fabonacci series
import java.util.*;
class Fabonacci
{
	public static void main(String args[])
	{
		int t1=0,t2=1,t3=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("How many terms? ");
		n=sc.nextInt();
		
		int i=3;
		while(i<=n)
		{
			System.out.println(t1 +" "+ t2);
			t3=t1+t2;
			t1=t2;
			t2=t3;
			
			System.out.print(" "+ t3);
			
		}
		i++;
	}
}