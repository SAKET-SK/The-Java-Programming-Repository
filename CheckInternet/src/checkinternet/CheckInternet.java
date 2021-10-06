package checkinternet;
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
