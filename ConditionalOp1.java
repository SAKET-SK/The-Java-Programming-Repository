//To find greatest of two numbers using conditional operator.
import java.lang.*;
class ConditionalOp1
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int max=a>b ? a : b;
		System.out.println("Greatest= "+max);
	}
}