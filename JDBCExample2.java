// Demonstrating Drop Database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample2 {
   static final String DB_URL = "jdbc:mysql://localhost/";
   static final String USER = "guest";
   static final String PASS = "guest123";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         String sql = "DROP DATABASE STUDENTS";
         stmt.executeUpdate(sql);
         System.out.println("Database dropped successfully...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
