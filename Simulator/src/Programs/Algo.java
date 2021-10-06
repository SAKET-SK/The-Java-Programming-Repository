package Programs;

import java.util.Scanner;
import java.util.Random;
class Algorithms{
	int input[],m,n;//n=no.of pages,m=no.of frames
	int p1[][],p2[][],p3[][],p4[][];
	String Input(int pages,int frames)
	{
		m=frames;
		n=pages;
		p1=new int[n+1][m+1];
		p2=new int[n+1][m+1];
		p3=new int[n+1][m+1];
		p4=new int[n+1][m+1];
		input=new int[pages];
		String S="";
		Random rand=new Random();
		for(int i=0;i<pages;i++)
		{
			int randomPri=rand.nextInt(15);
			int x=randomPri%10;
			input[i]=x;
			String s=Integer.toString(x);
			s=s+" ";
			int no=frames;
			S=S+s;
		}
		return S;
	}
	int frames()
	{
		return m;
	}
	int pages()
	{
		return n;
	}
	
	int LRU()
	{
		int counter[],A[],frame[],k=0;
		int pos1=0,count=0;
		 A=new int[n+1];
		int f = m;
		frame=new int[f+1];
		counter=new int[f+1];
		for(int i=1;i<=n;i++)
		{
			A[i]=input[i-1];
		}
		for(int i=1;i<=f;i++)
		{
			frame[i]=-2;
			p1[k][i-1]=frame[i];
			counter[i]=0;
		}
		k++;
		int ref=f-1;
		
		for(int i=1;i<=n;i++)
		{
			int found=0;
			int l=A[i];
			for(int j=1;j<=f;j++)
			{
				if(frame[j]==l)
				{
				    pos1=j;
					found=1;
				}
			}
			if(found==0)
			{
				int ins=0,j;
				for(j=1;j<=f;j++)
				{
					//p1[k][j-1]=frame[j];
					System.out.print(frame[j]+" ");
					System.out.print(p1[k][j-1]+" ");
					if(counter[j]!=-1)
					{
					counter[j]=counter[j]-1;
					}
					if(ins==0&&counter[j]==-1)
					{
						counter[j]=ref;
						frame[j]=l;
						ins=1;
					}
				}
				p1[k][f]=-4;
				//k++;
				count=count+1;
				System.out.println();
			}
			else if(found==1)
			{
				int ref1=counter[pos1],j;
				counter[pos1]=ref;
				for(j=1;j<=f;j++)
				{
					//p1[k][j-1]=frame[j];
					System.out.print(frame[j]+" ");
					System.out.print(p1[k][j-1]+" ");
					if(counter[j]>ref1&&j!=pos1)
					{
						counter[j]=counter[j]-1;
					}
				}
				p1[k][f]=-3;
				//k++;
				System.out.println();
			}
			for(int j=1;j<=f;j++)
				p1[k][j-1]=frame[j];
			k++;
			System.out.println("good="+frame[1]);
			System.out.println("good="+p1[1][0]);
		}
		//System.out.println("Page Faults:"+count);
		return count;
	}
	int FIFO(){
		int i,frno,a[],frame[],no,k,avail,count=0,l=0;
		a=new int[100];
		frame=new int[m];
		for(i=0;i<n;i++)
			a[i]=input[i];
		no=m;
		for(i=0;i<no;i++)
		{
			frame[i]=-1;
			p2[l][i]=frame[i];
		}
		l++;
		frno=0;
		for(i=0;i<n;i++)
		{
			p2[i+1][no]=-2;
			avail=0;
			for(k=0;k<no;k++)
			{
				if(frame[k]==a[i])
					avail=1;
			}
			if(avail==0)
			{
				frame[frno]=a[i];
				frno=(frno+1)%no;
				count+=1;
				p2[i+1][no]=-3;
			}
			for(int z=0;z<no;z++)
			{
				p2[l][z]=frame[z];
			}
			l++;
		}
		//System.out.println("No of page faults= "+count);
		return count;
	}
    
    int SecondChance(){
    	int i,frno,a[],frame[],no,k,avail,count=0,l=0,z;
		a=new int[100];
		int ref[]=new int[100];
		for(i=0;i<n;i++)
		{
			a[i]=input[i];
			ref[a[i]]=0;
		}
		no=m;
		frame=new int[no];
		for(i=0;i<no;i++)
		{
			frame[i]=-1;
			p3[l][i]=frame[i];
		}
		l++;
		frno=0;
		for(i=0;i<n;i++)
		{
			p3[i+1][no]=-2;
			avail=0;
			for(k=0;k<no;k++)
			{
				if(frame[k]==a[i])
				{
						avail=1;
						ref[a[i]]=1;
				}
			}
			if(avail==0 && frame[frno]==-1)
			{
				frame[frno]=a[i];
				frno=(frno+1)%no;
				count++;
				p3[i+1][no]=-3;
			}
			else if(avail==0)
			{
				int count1=count;
				while(count1==count)
				{
					if(ref[frame[frno]]==0)
					{
						frame[frno]=a[i];
						frno=(frno+1)%no;
						count+=1;
						p3[i+1][no]=-3;
					}
					else
					{
						ref[frame[frno]]=0;
						frno=(frno+1)%no;
					}
				}		
				
			}
			for(z=0;z<no;z++)
			{
				p3[l][z]=frame[z];
			}
			l++;
		}
		System.out.println("No of page faults= "+count);
	

    	return count;
    }
    int Optimal()
    {				
			int f=m,ref[],swap[],box[],pt=1,pf=0,k=0;
			ref=new int[n+10];
			swap=new int[f+10];
			box=new int[f+10];
			for(int i=1;i<=n;i++)
				ref[i]=input[i-1];
			//System.out.println("ref[1]="+ref[1]);
			for(int j=1;j<=f;j++)
			{
				box[j]=-1;
				p4[k][j-1]=box[j];
				swap[j]=0;
			}
			k++;
			for(int i=1;i<=n;i++)
			{
				p4[i][f]=-2;
				if(check(ref[i],f,box)==0)
				{
					if(full(f,box)==1)
						pt=pointer(i,f,box,n,ref);
					box[pt]=ref[i];
					pt++;
					pf++;
					p4[i][f]=-3;
				}
				for(int j=1;j<=f;j++)
				{
					p4[k][j-1]=box[j];
				}
				k++;
				//printbox(f,box);
			}
			
		
    return pf;
	}
	public void printbox(int f1,int box1[])
	{
		System.out.print("box=");
		for(int i=1;i<=f1;i++)
			System.out.print(box1[i]);
		System.out.println("");
	}
	public int check(int a,int b,int box1[])
	{
		for(int k=1;k<=b;k++)
		{
			if(a==box1[k])
				return 1;
		}
		return 0;
	}
	public int full(int b,int box1[])
	{
		for(int k=1;k<=b;k++)
		{
			if(box1[k]==-1)
				return 0;
		}
		return 1;
	}
	public int pointer(int i1,int f1,int box1[],int n1,int ref1[])
	{
		int ct[];
		ct=new int[f1+1];
		int m=2*n1;
		for(int j=1;j<=f1;j++)
		{	ct[j]=0;
			for(int i=i1+1;i<=n1;i++)
			{
				if(ref1[i]==box1[j])
				{
					ct[j]=i;
					break;
				}
			}
			if(ct[j]==0)
			{
				ct[j]=m;
				m=m-1;
			}
		}
		int max=0,maxi=0;
		System.out.print("a");
		printbox(f1,ct);
		for(int i=1;i<=f1;i++)
		{
			if(ct[i]>max)
			{
				max=ct[i];
				maxi=i;
			}
		}
		return maxi;
    }
	int [][] first()
	{
		System.out.println("yes"+p1[1][0]);
		return p1;
	}
	int [][] second()
	{
		return p2;
	}
	int [][] third()
	{
		return p3;
	}
	int [][] fourth()
	{
		return p4;
	}
}
public class Algo {

}
