//To find cricket score and run rate
import java.lang.*;
import java.util.*;
class Cricket
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ODI MATCH SCORECARD");
		System.out.println("Enter the name of team batting first: ");
		String team1=sc.next();
		int score1=0;
		float rr1=0;
		for(int i=1;i<=11;i++)                                         //Assuming that all 11 players batted
		{
			System.out.print("Enter player name: ");
			String nm1=sc.next();
			System.out.print("Enter runs scored by player: ");
			int runs1=sc.nextInt();
			score1=runs1+score1;
			rr1=(float)((score1))/50;
		}
		System.out.println("Total runs: "+score1);
		System.out.println("Run rate: "+rr1);
		System.out.println(team1+" scored "+score1+" runs at run rate "+rr1);
		
	}
}






















			