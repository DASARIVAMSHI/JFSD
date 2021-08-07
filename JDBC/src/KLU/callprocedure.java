package KLU;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class callprocedure {
  public static void main(String[] args) {
    
    String url= "jdbc:mysql://localhost:3306/klu";
    String user = "root";
    String pass = "root";
    
    
    try {
      System.out.println("Connecting to Database..."+url);
      @SuppressWarnings("unused")
      Connection con = DriverManager.getConnection(url,user,pass);
      CallableStatement stmt=con.prepareCall("{call proc1(?,?,?)}");
      // inserting values
      stmt.setString(1,"vamshi");
      stmt.setInt(2,3);
      stmt.setString(3,"hyderbad");
      
      stmt.setString(1,"ravi");
      stmt.setInt(2,4);
      stmt.setString(3,"warangal");
      
      stmt.setString(1,"vigneshwar");
      stmt.setInt(2,5);
      stmt.setString(3,"mumbai");
      stmt.execute();
      
      stmt.setString(1,"akash");
      stmt.setInt(2,4);
      stmt.setString(3,"chennai");
      
      stmt.setString(1,"sai raj");
      stmt.setInt(2,4);
      stmt.setString(3,"kerela");
      
      stmt.setString(1,"harry");
      stmt.setInt(2,4);
      stmt.setString(3,"suryapet");
     
      
      stmt.executeUpdate();
      System.out.println("inserted sucessfully");
      
    }  
    
      
      catch (SQLException e) {
          e.printStackTrace();
        }
   

}
}
      