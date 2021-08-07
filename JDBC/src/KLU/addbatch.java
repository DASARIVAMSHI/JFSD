package KLU;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class addbatch {
  private static final Connection NULL = null;

  public static void main(String[] args) {
    
    String url= "jdbc:mysql://localhost:3306/klu";
    String user = "root";
    String pass = "root";
    
    //String query = "insert into csestudents(Student_ID, Department, First_Name, Last_Name, PassOutYear, UniversityRank)values(?, ?, ?, ?, ?, ?);";
    //String query3 = "update CseStudents set First_Name = ? where Student_ID = ?";
    try {
      System.out.println("Connecting to Database..."+url);
      @SuppressWarnings("unused")
      Connection con = DriverManager.getConnection(url,user,pass);
      
      //Transaction setting AutoCommit as False
      con.setAutoCommit(false);
      
      System.out.println("Successfully Connected");
      
      
      Statement smt = con.createStatement();
      //ResultSet rs = smt.executeQuery(query);
      
      smt.addBatch("insert into CseStudents values(16, \"CSE\", \"akash\", \"Dasari\", 2020, 4)");
      smt.addBatch("insert into CseStudents values(17, \"CSE\", \"anadh\", \"Dasari\", 2020, 4)");
      //Making Transaction to roll back
      //con.rollback();
      int[] count = smt.executeBatch();
      con.commit();
      
      
      
      //int records = smt.executeUpdate();
      //System.out.println(String.format("Records affected", records));
      System.out.println("Trasaction Success");
      
      
      
      
      
    } catch (SQLException e) {
      e.printStackTrace();
    }
    
    
  }
  
}