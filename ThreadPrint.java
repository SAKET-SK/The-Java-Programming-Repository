class EvenThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			try{
			Thread.sleep(100);
			}
			catch (Exception e) {}
		}
	}
}
class OddThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			try{
			Thread.sleep(200);
			}
			catch (Exception e) {}
		}
	}
}
class ThreadPrint
{
	public static void main(String args[])
	{
		System.out.println("Printing Even Numbers: ");
		EvenThread a=new EvenThread();
		a.start();
		System.out.println("Printing Odd Numbers: ");
		OddThread b=new OddThread();
		b.start();
	}
}