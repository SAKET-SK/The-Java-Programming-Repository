//To input grade and dispaly the result
class GradeShow
{
	public static void main(String args[])
	{
		int per=Integer.parseInt(args[0]);
		switch(per/10)
		{
			case 10:
			case 9:
			case 8:
				System.out.print("Grade A");
				break;
			case 7:
			case 6:
				System.out.print("Grade B");
				break;
			case 5:
			case 4:
				System.out.print("Grade C");
				break;
			default:
				System.out.print("FAIL");
				break;
		}
	}
}
			