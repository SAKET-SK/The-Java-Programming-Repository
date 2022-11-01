// InetAddress Instance Methods
// InetAddress = HostName + IP address
import java.net.*;

class InetAddrInstance
{
    public static void main(String args[]) throws UnknownHostException
    {
        InetAddress ad1 = InetAddress.getByName("www.msbte.com");
        InetAddress ad2 = InetAddress.getByName("www.msbte.com");
        InetAddress ad3 = InetAddress.getByName("www.github.com");
        
        System.out.println("Result 1 ad = ad2 : " + ad1.equals(ad2));
        System.out.println("Result 2 ad = ad3 : " + ad1.equals(ad3));
        System.out.println("Result 3 getHostAddress ad1 : " + ad1.getHostAddress());
        System.out.println("Result 4 getHostName ad1 : " + ad1.getHostName());
        System.out.println("Result 5 isMultiCastAddress : " +ad1.isMultiCastAddress());
    }
}
