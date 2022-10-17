// Swapping data of different data types . Example of Method Overloading

import java.util.*;
class Swapping
{
    void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("Integer Value 1 : " + a);
        System.out.println("Integer Value 2 : " + b);
    }
    
    void swap(double a, double b)
    {
        double temp = a;
        a = b;
        b = temp;
        
        System.out.println("Double Value 1 : " + a);
        System.out.println("Double Value 2 : " + b);
    }
}

class SwapDataType
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(SYstem.in);
        System.out.println("Input 2 Integer values : ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        
        System.out.println("Input 2 Double values : ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        Swapping s1 = new Swapping();
        s1.swap(p,q);
        
        Swapping s2 = new Swapping();
        s2.swap(x,y);
    }
}
  
