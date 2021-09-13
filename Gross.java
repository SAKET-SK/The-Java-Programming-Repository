//To claculate gross salary
import java.util.*;
class Gross
{
	public static void main(String args[])
	{
		double basic,gross;
		System.out.print("Input basic salary: ");
		Scanner sc=new Scanner(System.in);
		basic=sc.nextDouble();
		int da=basic*(50/100);
		int ta=basic*(25/100);
		int hra=basic*(15/100);
		gross=basic+da+ta+hra;
		System.out.println("Gross salary: "+gross);
	}
}