// Checking if the number is perfect square or not.
import java.util.*;  
public class CheckPerfectSquareExample3   
{  
public static void main(String[] args)   
{  
//object of the Scanner class      
Scanner sc = new Scanner(System.in);  
System.out.print("Enter a number: ");  
//reading an integer from the user  
int number = sc.nextInt();  
//method calling inside the print statement  
System.out.print("Is the number perfect square? " +checkPerfectSquare(number));  
}  
public static boolean checkPerfectSquare(int number)   
{  
//calculating the remainder of the given number using the modulo operator  
int x=number % 10;  
//comparing the value of x with 2, 3, 7, and 8 using the Logical OR operator  
//perfect square never end with 2, 3, 7, and 8  
if (x==2 || x==3 || x==7 || x==8)   
{  
return false;  
}  
for (int i=0; i<=number/2 + 1; i++)   
{  
//type-casting the variable i and checking its equality with n  
if (i*i==number)   
{  
return true;  
}  
}  
return false;  
}  
}  
