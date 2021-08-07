package KLU;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class commit {
  public static void main(String[] args) {
    
    String url= "jdbc:mysql://localhost:3306/klu";
    String user = "root";
    String pass = "root";
    //String query = "select * from csestudents";
    String query ="INSERT INTO csestudents(Student_ID,Department,First_Name,Last_Name,PassOutYear,UniversityRank) values(?,?,?,?,?,?);";
    
    
    try {
      System.out.println("Connecting to Database..."+url);
      @SuppressWarnings("unused")
      Connection con = DriverManager.getConnection(url,user,pass);
      con.setAutoCommit(false);
      PreparedStatement stmt=con.prepareStatement(query);
      // inserting values
      stmt.setInt(1,11);
      stmt.setString(2,"EEE");
      stmt.setString(3,"sai_madhukar");
      stmt.setString(4,"vanam");
      stmt.setInt(5,2018);
      stmt.setInt(6,17);
      stmt.executeUpdate();
      
      con.commit();//transaction is sucessfully executed so we use commit and it updates in database
      System.out.println("Transaction executed sucessfully");
      
    }  
      
      catch (SQLException e) {
          e.printStackTrace();
        }
   

}
}
      