// Program to check internet connection to various URL's

package checkinternet; //Performed in NetBeans IDE, that's why package is used. 
import java.net.*;
public class CheckInternet 
{
    public static void main(String[] args) 
    {
        try
        {
            URL url=new URL("https://google.com");
            URLConnection con=url.openConnection();
            con.connect();
            System.out.println("Internet Connection Available");
        }
        catch (Exception e)
        {
            System.out.println("No Internet Connection");
        }
    }
}
