package KLU;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollableDelete {
	
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/klu";
		String user="root";
		String pass="root";
		
		
	try {
		Connection con=DriverManager.getConnection(url,pass,user);
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=st.executeQuery("select *from csestudents");
	
				rs.absolute(10);
				rs.deleteRow();
				System.out.println("sucessfully deleted");
	}catch(Exception e) {
		
	}
	}
}
	