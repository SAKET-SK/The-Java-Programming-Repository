package Programs;

import java.util.Scanner;
import java.util.Arrays;


public class DiskAlgos {

	/**
	 * @param args
	 */
	public int FCFS(int[] cylinders,int st,int n)
	{
		int size,start,cylcount=0;
		start=st;
		size=200;
		for(int i=0;i<n;i++)
		{
			if(cylinders[i]<size-1)
			{
				cylcount+=Math.abs(start-cylinders[i]);
				start=cylinders[i];
			}
		}
		System.out.println(cylcount);
		return cylcount;
	}
	public int[] SSTF(int[] cylinders,int st,int n)
	{
		int ans[]=new int[n+1];
		int size,start,cylcount=0;
		size=200;
		start=st;
		Scanner S=new Scanner(System.in);
		int valid[]=new int[n];
		for(int i=0;i<n;i++)
		{
			valid[i]=1;
		}
		S.close();
		int min;
		int k=n+1;
		int curr=k;
		int l=0;
		for(int i=0;i<n;i++)
		{
			int flag=0;
			min=99999;
			for(int j=0;j<n;j++)
			{
				if(valid[j]==1 && cylinders[j]!=start && cylinders[i]<=size-1)
				{
					if(Math.abs(cylinders[j]-start)<min)
					{
						min=Math.abs(cylinders[j]-start);
						k=j;
					}
				}
				else if(cylinders[j]==start && j!=curr)
				{
					valid[j]=0;
					ans[l]=start;
					l++;
					flag=1;
				}
			}
			cylcount+=min;
			if(flag==0){
			ans[l]=cylinders[k];
			l++;}
			valid[k]=0;
			start=cylinders[k];
			curr=k;
		}
		System.out.println(cylcount);
		ans[l]=cylcount;
		return ans;
	}
	public int[] scan(int[] cylinders,int st,int n)
	{
		int size,start;
		int[] ans= new int[n+2];
		size=200;
		start=st;
		Scanner S=new Scanner(System.in);
		int cylcount=0;
		Arrays.sort(cylinders);
		S.close();
		int min=9999,min1=9999,index=0,index1=0;
		for(int i=0;i<n;i++)
		{
			if(cylinders[i]<start && start-cylinders[i]<min)
			{
				min=start-cylinders[i];
				index=i;
			}
			else if(cylinders[i]>start && cylinders[i]-start<min1)
			{
				min1=cylinders[i]-start;
				index1=i;
			}
		}
		int l=0;
		if(start-0<Math.abs(start-cylinders[n-1]))
		{
			cylcount+=start+cylinders[n-1];
			for(int i=index;i>=0;i--){
				ans[l]=cylinders[i];
				l++;
			}
			ans[l]=0;
			l++;
			for(int i=index1;i<n;i++){
				ans[l]=cylinders[i];
				System.out.println(ans[l]);
				l++;
			}
		}
		else
		{
			cylcount+=(size-1-start)+(size-1-cylinders[0]);
			for(int i=index1;i<n;i++){
				ans[l]=cylinders[i];
				l++;
			}
			ans[l]=199;
			l++;
			for(int i=index;i>=0;i--){
				ans[l]=cylinders[i];
				l++;
			}
		}
		System.out.println(cylcount);
		ans[l]=cylcount;
		return ans; 
	}
	public int[] look(int[] cylinders,int st,int n)
	{
		int size,start;
		size=200;
		start=st;
		Scanner S=new Scanner(System.in);
		int cylcount=0;
		Arrays.sort(cylinders);
		S.close();
		int min=9999,min1=9999,index=0,index1=0;
		for(int i=0;i<n;i++)
		{
			if(cylinders[i]<start && start-cylinders[i]<min)
			{
				min=start-cylinders[i];
				index=i;
			}
			else if(cylinders[i]>start && cylinders[i]-start<min1)
			{
				min1=cylinders[i]-start;
				index1=i;
			}
		}
		int l=0;
		int[] ans=new int[n+1];
		if(start-0<Math.abs(start-cylinders[n-1]))
		{
			cylcount+=(start-cylinders[0])+(cylinders[n-1]-cylinders[0]);
			for(int i=index;i>=0;i--){
				ans[l]=cylinders[i];
				l++;
			}
			for(int i=index1;i<n;i++){
				ans[l]=cylinders[i];
				l++;
			}
		}
		else
		{
			cylcount+=(cylinders[n-1]-start)+(cylinders[n-1]-cylinders[0]);
			for(int i=index1;i<n;i++){
				ans[l]=cylinders[i];
				l++;
			}
			for(int i=index;i>=0;i--){
				ans[l]=cylinders[i];
				l++;
			}
		}
		System.out.println(cylcount);
		ans[l]=cylcount;
		return ans; 
	}
	public int[] CScan(int[] cylinders,int st,int n)
	{
		int direction=1;
		int size,start;
		size=200;
		start=st;
		Scanner S=new Scanner(System.in);
		int cylcount=0;
		int min=9999,min1=9999,index=0,index1=0;
		Arrays.sort(cylinders);
		for(int i=0;i<n;i++)
		{
			if(cylinders[i]<start && start-cylinders[i]<min)
			{
				min=start-cylinders[i];
				index=i;
			}
			else if(cylinders[i]>start && cylinders[i]-start<min1)
			{
				min1=cylinders[i]-start;
				index1=i;
			}
		}
		S.close();
		int l=0;
		int[] ans= new int[n+2];
		if(direction==0)
		{
			cylcount+=start+size-1-cylinders[index1];
			for(int i=index;i>=0;i--){
				ans[l]=cylinders[i];
				l++;
			}
			ans[l]=0;
			l++;
			for(int i=index1;i<n;i++){
				ans[l]=cylinders[i];
				l++;
			}
		}
		else if(direction==1)
		{
			cylcount+=size-1-start+cylinders[index];
			for(int i=index1;i<n;i++){
				ans[l]=cylinders[i];
				l++;
			}
			ans[l]=199;
			l++;
			for(int i=index;i>=0;i--){
				ans[l]=cylinders[i];
				l++;
			}
		}
		System.out.println(cylcount);
		ans[l]=cylcount;
		return ans; 
	}
	public int[] Clook(int[] cylinders,int st,int n)
	{
		int direction=1;
		int size,start;
		start=st;
		size=200;
		Scanner S=new Scanner(System.in);
		int cylcount=0;
		int min=9999,min1=9999,index=0,index1=0;
		Arrays.sort(cylinders);
		for(int i=0;i<n;i++)
		{
			if(cylinders[i]<start && start-cylinders[i]<min)
			{
				min=start-cylinders[i];
				index=i;
			}
			else if(cylinders[i]>start && cylinders[i]-start<min1)
			{
				min1=cylinders[i]-start;
				index1=i;
			}
		}
		S.close();
		int l=0;
		int[] ans=new int[n+1];
		if(direction==0)
		{
			cylcount+=start-cylinders[0]+cylinders[n-1]-cylinders[index1];
			for(int i=index;i>=0;i--){
				ans[l]=cylinders[i];
				l++;
			}
			for(int i=index1;i<n;i++){
				ans[l]=cylinders[i];
				l++;
			}
		}
		else if(direction==1)
		{
			cylcount+=cylinders[n-1]-start+cylinders[index]-cylinders[0];
			for(int i=index1;i<n;i++){
				ans[l]=cylinders[i];
				l++;
			}
			for(int i=index;i>=0;i--){
				ans[l]=cylinders[i];
				l++;
			}
		}
		System.out.println(cylcount);
		ans[l]=cylcount;
		return ans;
	}
	public static void main(String[] args){
		
	}

}
