// This program prints milliseconds since 1 January 1970

import java.util.Date;
class DateDemo
{
    public static void main(String args[])
    {
        Date dt = new Date();
        System.out.println(dt);
        long msec = dt.getTime();
        System.out.println("Milliseconds since 1 January 1970 :- " +msec);
    }
}
