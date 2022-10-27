// Demonstrating URL Class

import java.net.*;
class URLDemo
{
    public static void main(String args[]) throws MalformedURLException 
    {
        URL hp = new URL("http://www.osborne.com:80/index.htm");
        System.out.println("Protocol :- " + hp.getProtocol());
        System.out.println("Port :- " + hp.getPort());
        System.out.println("Host :- " + hp.getHost());
        System.out.println("File :- " + hp.getFile());
        System.out.println("Ext :- " + hp.toExternalForm());
    }
}
  
