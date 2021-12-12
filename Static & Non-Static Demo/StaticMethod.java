//Demonstarting static method in Java.
//Program to find factorial of any number

import java.lang.*;
import java.io.*;

class StaticMethod
{
    public static void main(String args[])
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a number :- ");
            int n = Integer.parseInt(br.readLine());
            System.out.println("You Entered : " + n + "Factorial is : " + StaticMethod.facto(n));    //Static method belongs to class, so need to access it by class reference
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
    public static int facto(int n)        //Static Method named as facto
    {
        int f = 1;
        while(n > 0)
        {
            f *= n;      //Shorthand for f = f * n
            n--;
        }
        return f;
    }
}
    
  
