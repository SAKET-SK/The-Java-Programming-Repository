import java.util.*;

class MyExp extends Exception
{
    MyExp(String msg)
    {
        super(msg);
    }
}
class ExceptionOwn 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Percentage :- ");
        int per = sc.nextInt();
        
        try
        {
            if(per < 40)
            {
                throw new MyExp("YOU ARE FAILED, LOSER!!");
            }
            else
            {
                System.out.println("YOU ARE PASSED, GOOD JOB!");
            }
            System.out.println("You Obtained " + per + "percent");
        }
        catch(MyExp e)
        {
            System.out.println(e.getMessage());
        }
    }
}
