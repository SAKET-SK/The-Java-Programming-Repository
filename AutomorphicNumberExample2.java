// A number is called an automorphic number if and only if the square of the given number ends with the same number itself. For example, 25, 76 are automorphic numbers because their square is 625 and 5776, respectively and the last two digits of the square represent the number itself. Some other automorphic numbers are 5, 6, 36, 890625, etc.
import java.util.Scanner;  
public class AutomorphicNumberExample2  
{  
public static void main(String args[])  
{  
Scanner in = new Scanner(System.in);  
System.out.print("Enter a number to check: ");  
//reading a number from the user  
int num = in.nextInt();  
int count=0;  
//determines the square of the given number  
int square = num*num;  
//copying the variable num into temp  
int temp = num;    
//iterate over the variable num until the condition become false  
while(temp>0)  
{  
count++;  
//removes last digit of the variable num  
temp=temp/10;  
}   
//determines the last digit of the variable square  
int lastDigit = (int) (square%(Math.pow(10, count)));   
//compare num with last digit of the variable square  
if(num == lastDigit)  
System.out.println(num+ " is an automorphic number.");  
else  
System.out.println(num+ " is not an automorphic number.");  
}  
}  
