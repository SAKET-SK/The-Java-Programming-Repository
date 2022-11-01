//InetAddress Factory Methods

import java.net.*;
class InetAddrFactory
{
    public static void main(String args[]) throws UnknownHostException
    {
        InetAddress ad1 = InetAddress.getLocalHost();
        System.out.println(ad1);
        
        InetAddress ad2 = InetAddress.getByName("www.oracle.com");
        System.out.println(ad2);
        
        byte adrs [] = {127,0,0,1};
        InetAddress ad3 = InetAddress.getByAddress(adrs);
        System.out.println(ad3);
        
        InetAddress ad4 = InetAddress.getAllByAddress("www.google.com");
        for(int i = 0; i < ad4.length; i++)
        {
            System.out.println(ad4[i]);
        }
    }
}
