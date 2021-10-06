package Programs;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class process
{
	int A[],n,Arr[],Exe[],m,Pri[],qt,st[],en[],s[],arr[],exec[],backup[];
	
	int[][] input(int a,int b){
		Scanner S=new Scanner(System.in);
		n=a;
		qt=b;
		//System.out.println("Enter the number of processes:");
		//System.out.println("Enter the time quantum of RR");
		m=n;
		Random rand=new Random();
		int i;
		A = new int[n];
		Arr = new int[n];
		arr=new int[n];
		exec= new int[n];
		Exe=new int[n+1];
		Pri=new int[n+1];
		st=new int[n];
		en=new int[n];
		s=new int[n];
		backup=new int[n];
		int max=0,min=0,sum=0;
		String NL = System.getProperty("line.separator");
		for(i=0;i<n;i++)
		{
			int randomInt = rand.nextInt(10);
			if(i>0)
			{
				max=sum;
				min=Arr[i-1];
			}
			int randomArr=rand.nextInt((max - min) + 1) + min;
			int randomPri=rand.nextInt(10);
			A[i]=randomInt+1;
			backup[i]=A[i];
			sum+=A[i];
			if (i==0)
				Arr[i]=0;
			else
				Arr[i]=randomArr;
			Pri[i]=randomPri+1;
			Exe[i]=A[i];
			exec[i]=A[i];
		}
		Arrays.sort(Arr);
		for(i=0;i<n;i++)
			arr[i]=Arr[i];
		String S1="";
		S1=S1+"Process     Arrival Time         Burst Time        Priority"+'\n';
		//System.out.println("Process     Arrival Time         Burst Time        Priority");
			int[][] Table;
			Table =new int[n][3];
			for(i=0;i<n;i++){
				Table[i][0]=Arr[i];
				Table[i][1]=A[i];
				Table[i][2]=Pri[i];

			}
			//System.out.println(S1);
			S.close();
			return Table;
		}
	float fcfs(){
		int i,sum1=A[0];
		float sum=0;
		for(i=1;i<n;i++)
		{
			int wait=sum1-Arr[i];
			if (wait<0)
				wait=0;
			sum+=wait;
			sum1+=A[i];
		}
		float average=(sum/n);
		return average;	
	}
	float Priority_preemptive(){
		Pri[m]=100;
		int remain=m,smallest,wt=0;
		for(int time=0;remain!=0;time++)
		{
			smallest=m;
			for(int i=0;i<m;i++)
			{
				if(Arr[i]<=time&&Pri[i]<Pri[smallest]&&Exe[i]>0)
				{
					smallest=i;
				}
			}
			Exe[smallest]--;
			if(Exe[smallest]==0)
			{
				remain--;
				wt=wt+time+1-Arr[smallest]-A[smallest];
			}
		}
		for(int i=0;i<n;i++){
			Exe[i]=A[i];
		}
		return (float)wt/m;
		//System.out.println("Avg waiting time: "+(float)wt/m);
	}
	float Preemptive(){
		Exe[m]=100;
		int remain=m,smallest,wt=0;
		for(int time=0;remain!=0;time++)
		{
			smallest=m;
			for(int i=0;i<m;i++)
			{
				if(Arr[i]<=time&&Exe[i]<Exe[smallest]&&Exe[i]>0)
				{
					smallest=i;
				}
			}
			Exe[smallest]--;
			if(Exe[smallest]==0)
			{
				remain--;
				wt=wt+time+1-Arr[smallest]-A[smallest];
			}
		}
		int i;
		for(i=0;i<n;i++)
			Exe[i]=A[i];
		return (float)wt/m;
		//System.out.println("Avg waiting time: "+(float)wt/m);
	}
	float rr(){
		int i,sum=0,btime=0,visited=0,count=0;
		for(i=0;i<=n-1;i++)
		{
			st[i]=0;
			en[i]=arr[i];
			s[i]=0;
		}
		while(visited==0)
		{
			for(i=0;i<=n-1;i++)
			{
				if(exec[i]!=0 && arr[i]<=btime)
				{
					//System.out.println("a");
					if(exec[i]<qt)
					{
						//System.out.println("a1");
						//en[i]=st[i]+exec[i];
						st[i]=btime;
						s[i]=s[i]+st[i]-en[i];
						btime=btime+exec[i];
						//en[i]=btime;
						exec[i]=0;
					}
					else
					{
						//System.out.println("a2");
						exec[i]=exec[i]-qt;
						st[i]=btime;
						s[i]=s[i]+st[i]-en[i];
						btime=btime+qt;
						en[i]=btime;
					}
				}
			}
			//for(i=0;i<=n-1;i++)
			//System.out.println("exec="+exec[i]);
			for(i=0,count=0;i<=n-1;i++)
			{
				//System.out.println("b");
				if(exec[i]==0)
					count++;
			}
			if(count==n)
				visited=1;
		}
		for(i=0;i<=n-1;i++)
		{
			//System.out.println("s[i]="+s[i]);
			//sum=sum+s[i]-arr[i];
			sum=sum+s[i];
		}
		//System.out.println("sum="+sum);
	float average=(float)sum/n;
	for(i=0;i<n;i++)
		exec[i]=A[i];
	return average;
}



	float non_Preemptive_pri(){
		int valid[],curr=0,waiting=0;
		valid =new int[m];
		int systime=0;
		for(int i=0;i<m;i++)
		{
			valid[i]=0;
		}
		for(int j=0;j<m;j++)
		{
			int max=9999;
			for(int i=0;i<m;i++)
			{
				if(Pri[i]<max&&valid[i]!=1&&Arr[i]<=systime)
				{
				max=Pri[i];
				curr=i;
				}
			}
			valid[curr]=1;
			if(j!=0)
			{
				int wait;
				wait=systime-Arr[curr];
				if (systime-Arr[curr]<0)
				{
					wait=0;
				}
				waiting=waiting+wait;;
			}
				
			
		
			systime=systime+A[curr];
		
		}
		return (float)waiting/m;
	}
	float np()
	 {
		 int valid[],curr=0,waiting=0;
			valid =new int[m];
			int systime=0;
			for(int i=0;i<m;i++)
			{
				valid[i]=0;
			}
			for(int j=0;j<m;j++)
			{
				int max=9999;
				for(int i=0;i<m;i++)
				{
					if(A[i]<max&&valid[i]!=1&&Arr[i]<=systime)
					{
						max=A[i];
						curr=i;
					}
				}
				valid[curr]=1;
				if(j!=0)
				{
					int wait;
					wait=systime-Arr[curr];
					if (systime-Arr[curr]<0)
					{
						wait=0;
					}
					waiting=waiting+wait;;
				}
					
				
			
				systime=systime+A[curr];
			
			}
			return (float)waiting/m;
	 }
}
public class Processes {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}