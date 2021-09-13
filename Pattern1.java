//To print * pattern
class Pattern1
{
	public static void main(String [] args)
	{
		int i,j,n;
		n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println( );
		}
	}
}