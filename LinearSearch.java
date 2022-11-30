import java.util.*;

class LinearSearch
{
    public static void main(String args[])
    {
        int c,n,search,array[];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in an array :- ");  //Inputting values to be entered in an array
        n = sc.nextInt();
        array = new int[n];  // Creating an array according to the size specified by the user
        
        System.out.println("Enter "+ n +" integers to be put in array :- ");
        for(int c = 0; c < n; c++)
        {
            array[c] = sc.nextInt();
        }
        System.out.println("Enter the value to find :- ");
        search = sc.nextInt();
        
        for(c = 0; c < n; c++)
        {
            if(array[c] == search)  // If the element is present
            {
                System.out.println(search + "is present at location " + (c+1) + ".");
                break;
            }
        }
        if(c == n)
        {
            System.out.println(search + "is not present at in the array");
        }
    }
}
