package useFul;
public class UseMe
{
	public void rectArea()
	{
		int l=12;
		int b=8;
		int ar=l*b;
		System.out.println("Rectangle area:- "+ar);
	}
	

	public void salary()
	{
		double basic_sal=10000.0;
		double da=(basic_sal*50)/100;
		double hra=(basic_sal*15)/100;
		double gross=basic_sal+da+hra;
		System.out.println("Basic salary:- "+basic_sal);
		System.out.println("Gross salary:- "+gross);
	}

	public void percentage()
	{
		int total_marks=500,scored_marks=428;
		
		System.out.println("Total marks:- "+total_marks);
		System.out.println("Scored marks:- "+scored_marks);
		float pr=(float)(scored_marks*100)/total_marks;
		System.out.println("Percentage:- "+pr);
	}
		
}