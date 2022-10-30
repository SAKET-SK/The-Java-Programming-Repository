// Program to demonstrate Datagrams

import java.awt.*;

class DatagramDemo
{
    public static int server_port = 998;
    public static int client_port = 999;
    public static int size = 1024;
    public static DatagramSocket ds;
    public static byte buffer[] = new byte [size];
    
    public static void TheServer() throws Exception
    {
        int pos = 0;
        while(true)
        {
            int c = System.in.read();
            switch(c)
            {
                case -1:
                    System.out.println("Server Quit");
                    return;
                case '\n':
                    DatagramPacket p1 = new DatagramPacket(buffer,pos,InetAddress.getLocalHost(),client_port);
                    ds.send(p1);
                    pos = 0;
                    break;
                default:
                    buffer[pos++] = (byte)c;
            }
        }
    }
    public static void TheClient() throws Exception
    {
        while(true)
        {
            DatagramPacket p2 = new DatagramPacket(buffer,buffer.length);
            ds.receive(p2);
            System.out.println(new String(p2.getData(),0,p2.getLength()));
        }
    }
    public static void main(String args[]) throws Exception
    {
        if(args.length == 1)
        {
            ds = new DatagramSocket(server_port);
            TheServer();
        }
        else
        {
            ds = new DatagramSocket(client_port);
            TheClient();
        }
    }
}
