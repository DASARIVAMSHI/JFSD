package KLU;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScrollableResultset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url= "jdbc:mysql://localhost:3306/klu";
	    String user = "root";
	    String pass = "root";
	    
	    
	    try {
			Connection con=DriverManager.getConnection(url,user,pass);
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	        ResultSet rs=st.executeQuery("select *from csestudents");
	        rs.beforeFirst();
	        rs.afterLast();
	        rs.absolute(3);
	        while(rs.previous()) {
	        	
	        System.out.println(rs.getInt(1)+" "+rs.getString(2)+""+rs.getString(3)+""+rs.getString(4)+""+rs.getInt(5)+""+rs.getInt(6));
	        }
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
