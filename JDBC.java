// Demonstration of JDBC

import java.sql.*;
{
    public class JDBC
    {
        public static void main(String args[])
        {
            try
            {
                ClassforName("sun_jdbc_odbc_JdbcOdbcDriver");
                Connection con = DriverManager.getConnection("jdbc.odbc.ds1","","");
                Statement s = con.createStatement();
                
                s.execute("create table player(pno integer, runs integer)");
                s.execute("insert into player values(8,4500)");
                s.execute("insert into player values(6,6700)");
                s.execute("Select pno,runs from player");
                
                ResultSet rs = s.getResultSet();
                
                while(rs.next())
                {
                    System.out.println("Data from Player Number :- " + rs.getInt(1));
                    System.out.println("Data from Runs Scored :- " + rs.getInt(2));
                }
                s.close();
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error :- " + e);
            }
        }
    }
}
