package tenmultiples;
// Demonstrating non- static method in java 
// a non-static method to read a no and find 10 multiples of it
import java.lang.*;
import java.util.*;
class  TenMultiples
{
	// a non static method to find 10 multiples 
	public void multi(int n)
	{
		for(int i=1;i<=10;i++)
			System.out.println(n+" * "+i+" = "+(n*i));

	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a No :");
		int n=sc.nextInt();
		TenMultiples dns=new TenMultiples();
		dns.multi(n); // call to non-static void multi()
	}
}
