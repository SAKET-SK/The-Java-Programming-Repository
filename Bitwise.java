//To demonstrate bitwise operators
import java.util.*;
class Bitwise
{
	public static void main(String args[])
	{
		int a,b,c,ans;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of a: ");
		a=sc.nextInt();
		System.out.print("Enter value of b: ");
		b=sc.nextInt();
		System.out.print("Enter value of c: ");
		c=sc.nextInt();
		ans=a & b;
		System.out.println("Bitwise ANDing a & b: "+ans);
		ans=a | b;
		System.out.println("Bitwise ORing a | b: "+ans);
		ans=a ^ b;
		System.out.println("Bitwise EX-ORing a ^ b: "+ans);
		ans=c<<1;
		System.out.println("Bitwise LEFT SHIFT c<<1: "+ans);
		ans=c>>1;
		System.out.println("Bitwise RIGHT SHIFT c>>1: "+ans);
		ans=c>>>1;
		System.out.println("Bitwise RIGHT SHIFT WITH FILL ZERO c>>>1: "+ans);
		ans=~a;
		System.out.println("Bitwise COMPLEMENT ~a: "+ans);
	}
}

		