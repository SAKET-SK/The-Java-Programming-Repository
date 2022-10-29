// to input price and print discount

import java.lang.*;
import java.util.*;
class Prg5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter item name: - ");
        String nm1 = sc.next();
        System.out.println("Enter item price: - ");
        int pr1 = sc.nextInt();
        System.out.println("Enter item quantity: - ");
        int qty1 = sc.nextInt();
        
        float total = pr1;
        float discount = (float)(total/100)*10;
        float net_bill = total - discount;
        
        System.out.println("Price :- " + total);
        System.out.println("Discount in Percent :- " + discount);
        System.out.println("Total :- " + total);
    }
}
