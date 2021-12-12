//Demonstration of non static method
import java.lang.*;
import java.io.*;

class NonStaticDemo
{
    public static void main(String args[])
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a Number to reverse :- ");
            int n = Integer.parseInt(br.readLine());
            NonStaticDemo rev = new NonStaticDemo();       //Non static method require to be called by object reference, as it belongs to object
            System.out.println("Reverse Number is :- ");
            rev.reverseNo(n);
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
        catch(Exception exc)
        {
            exc.printStackTrace();
        }
    }
    public void reverseNo(int n)
    {
        while(n > 0)
        {
           System.out.println(n % 10)
           n /= 10;       //Shorthand for n = n / 10
        }
    }
    public String reverseNo(int n)
    {
        String rev = " ";
        rev += n % 10;
    }
}
