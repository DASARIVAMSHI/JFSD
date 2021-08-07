package KLU;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollableUpdate {
	
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/klu";
		String user="root";
		String pass="root";
		
		
	try {
		Connection con=DriverManager.getConnection(url,pass,user);
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=st.executeQuery("select *from csestudents");
		rs.absolute(2);
		rs.updateString("Department","CSE");
		rs.updateRow();
		System.out.println("sucessfully updated");	
		
		
	}catch(Exception e) {
		
	}
	}

}
