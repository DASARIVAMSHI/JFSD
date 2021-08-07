package KLU;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class update {
  public static void main(String[] args) {
    
    String url= "jdbc:mysql://localhost:3306/klu";
    String user = "root";
    String pass = "root";
    //String query = "select * from csestudents";
    String query =("UPDATE csestudents set First_Name=? where Student_ID=?");
    
    
    try {
      System.out.println("Connecting to Database..."+url);
      @SuppressWarnings("unused")
      Connection con = DriverManager.getConnection(url,user,pass);
      PreparedStatement stmt=con.prepareStatement(query);
      // update
      stmt.setString(1,"akash");
      stmt.setInt(2,3);
      int records=stmt.executeUpdate();
      System.out.println(String.format("rows affected",records));
      
    }  
      
      catch (SQLException e) {
          e.printStackTrace();
        }
   

}
}
      