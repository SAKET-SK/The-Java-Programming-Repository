import java.util.*;
class Fibbo
{
  public static void main(String args[])
  {
    int t1=1,t2=1,t3,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Input numer");
    
    n=sc.nextInt();
    System.out.println();
    System.out.println(t1);
    System.out.println(t2);
    for(int i=1;i<=n-2;i++)
     {

        t3=t1+t2;
        System.out.println(t3);
        t1=t2;
        t2=t3;
       
     }

  }


}