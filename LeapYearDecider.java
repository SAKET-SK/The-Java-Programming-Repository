//To decide if the year is leap year or not
class LeapYearDecider
{
	public static void main(String args[])
	{
		int year=Integer.parseInt(args[0]);
		if(year%400==0)
			System.out.println("Leap year");
		else if(year%100==0)
			System.out.println("Not a leap year");
		else if(year%4==0)
			System.out.println("Leap year");
		else
			System.out.println("Not a leap year");
	}
}