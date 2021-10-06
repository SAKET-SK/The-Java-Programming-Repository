package factorial;
// Factorial : n!= n * n-1 * n-2......1
// 4!= 4x 3 x 2 x 1 = 24
import java.lang.*;
import java.util.*;
class  Factorial 
{
    public static int facto(int n)
	{
		// process for finding factorial
		int f=1;
		while(n>0)
		{
			f*=n ; // f=f*n
			n--; // n=n-1
		}

		return f;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no:");
		int n=sc.nextInt();
		System.out.println("No :"+n+"Factorial :"+facto(n));
	} // End of main
}// End of class 
