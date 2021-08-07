package KLU;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {
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
      PreparedStatement stmt=con.prepareStatement(query);
      // inserting values
      stmt.setInt(1,6);
      stmt.setString(2,"ECE");
      stmt.setString(3,"suresh");
      stmt.setString(4,"kumar");
      stmt.setInt(5,5);
      stmt.setInt(6,3);
      int records=stmt.executeUpdate();
      System.out.println(String.format("rows affected",records));
      
    }  
      
      catch (SQLException e) {
          e.printStackTrace();
        }
   

}
}
      