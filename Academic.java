//Read student name, roll no and subject marks to find total, and percentage
import java.lang.*;
import java.util.*;
class Academic
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String nm=sc.nextLine();
		System.out.print("Enter your Roll Number: ");
		int rn=sc.nextInt();
		System.out.print("Enter marks of subject ENGLISH");
		int s1=sc.nextInt();
		System.out.print("Enter marks of subject MARATHI");
		int s2=sc.nextInt();
		System.out.print("Enter marks of subject HINDI/SANSKRIT");
		int s3=sc.nextInt();
		System.out.print("Enter marks of subject HISTORY & GEOGRAPHY");
		int s4=sc.nextInt();
		System.out.print("Enter marks of subject MATHEMATICS");
		int s5=sc.nextInt();
		System.out.print("Enter marks of subject SCIENCE");
		int s6=sc.nextInt();
		int total=s1+s2+s3+s4+s5+s6;
		float percent=(float)total/6;
		System.out.println("Name of student: "+nm);
		System.out.println("ENGLISH: "+s1);
		System.out.println("MARATHI: "+s2);
		System.out.println("HINDI/SANSKRIT: "+s3);
		System.out.println("HISTORY & GEOGRAPHY: "+s4);
		System.out.println("MATHEMATICS: "+s5);
		System.out.println("SCIENCE: "+s6);
		System.out.println("TOTAL MARKS OF 600: "+total);
		System.out.println("PERCENTAGE: "+percent);
	}
}
	







