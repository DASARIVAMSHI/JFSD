package KLU;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Rollback {
  public static void main(String[] args) {
    
    String url= "jdbc:mysql://localhost:3306/klu";
    String user = "root";
    String pass = "root";
    //String query = "select * from csestudents";
    String query =("UPDATE csestudents SET First_Name=? where Student_ID=?");
    
    
    try {
      System.out.println("Connecting to Database..."+url);
      @SuppressWarnings("unused")
      Connection con = DriverManager.getConnection(url,user,pass);
      con.setAutoCommit(false);
      PreparedStatement stmt=con.prepareStatement(query);
      // update
      stmt.setString(1,"madhukar sir");
      stmt.setInt(2,5);
      stmt.executeUpdate();
      //int records=stmt.executeUpdate();
      //System.out.println(String.format("rows affected",records));
        con.rollback();//transcation fails so it wont update in database 
        System.out.println("oops transaction has failed");
      
    }  
      
      catch (SQLException e) {
          e.printStackTrace();
        }
   

}
}
      