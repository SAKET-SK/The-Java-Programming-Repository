// To demonstrate BufferedReader class

import java.io.*;
class BufferedDemo
{
    public static void main(String args[]) throws IOException
    {
        String nm;
        int rn;
        float percent;
        
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(i);
        
        System.out.println("Input Student NAME, ROLL NO and PERCENTAGE : ");
        nm = br.readLine();
        rn = Integer.parseInt(br.readLine());
        percent = Float.parseFloat(br.readLine());
        
        System.out.println("Name : " + nm);
        System.out.println("Roll No : " + rn);
        System.out.println("Percentage : " + percent);
    }
}
  
