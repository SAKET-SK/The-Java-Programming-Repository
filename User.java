import java.io.*;
class MyException extends Exception
{
	MyException(String msg)
	{
		super(msg);
	}
}
class User
{
	public static void main(String args[])
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter even number:- ");
			int n=Integer.parseInt(br.readLine());
			if(n%2!=0)
				throw new MyException("Number is odd. Please enter even number.");
			else
				throw new MyException("This is even number.");
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{ }
	}
}
			