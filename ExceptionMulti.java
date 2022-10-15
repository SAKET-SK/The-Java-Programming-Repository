// Demonstrating multiple catching of Exceptions

import java.util.*;
class ExceptionMulti
{
    public static void main(String args[])
    {
        int a[] = {5,10};
        int b = 5;
        
        try
        {
            int x = a[2] / b - a[1];      // a[2] is non-existant
            System.out.println("x = " + x);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by Zero");     // never happen in this code
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Error");     // We will get this
        }
        catch(ArrayStoreException e)
        {
            System.out.println("Wrong Datatype");      // Will be ignored
        }
        finally
        {
            int y = a[1] / a[0];
            System.out.println("y = " +y);   // a = 2
        }
    }
}
