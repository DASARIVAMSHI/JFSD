package KLU;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Scrollableinsertion {
	
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/klu";
		String user="root";
		String pass="root";
		
		
	try {
		Connection con=DriverManager.getConnection(url,pass,user);
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=st.executeQuery("select *from csestudents");
		//rs.last();
				rs.afterLast();
				rs.moveToInsertRow();
				
				rs.updateInt("Student_ID",20);
				rs.updateString("Department","CIVIL");
				rs.updateString("First_Name","sathya");
				rs.updateString("Last_Name","kamal");
				rs.updateInt("PassOutYear",2020);
				rs.updateInt("UniversityRank",3);
				rs.insertRow();
				System.out.println("Sucessfully inserted");
	}catch(Exception e) {
		
	}
	}
}
		
	