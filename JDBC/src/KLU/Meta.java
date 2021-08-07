package KLU;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Meta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url= "jdbc:mysql://localhost:3306/klu";
	    String user = "root";
	    String pass = "root";
	    
	    
	    try {
			Connection con=DriverManager.getConnection(url,user,pass);
			PreparedStatement st=con.prepareStatement("select *from csestudents");
			ResultSet rs=st.executeQuery();
			ResultSetMetaData r=rs.getMetaData();
			
			System.out.println("no of columns:-"+r.getColumnCount());
			System.out.println("columns names:-"+r.getColumnName(1));
			System.out.println("column type:-"+r.getColumnTypeName(3));
			System.out.println("column size:-"+r.getColumnDisplaySize(1));
			System.out.println("column class name:-"+r.getColumnClassName(4));
			System.out.println("column catalogname:-"+r.getCatalogName(3));
			System.out.println("column catalogname:-"+r.getTableName(2));
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
