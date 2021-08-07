package KLU;

import java.sql.Connection;

import java.sql.DriverManager;


import java.sql.SQLException;

public class DatabaseMetaData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url= "jdbc:mysql://localhost:3306/klu";
	    String user = "root";
	    String pass = "root";
	    
	    
	    try {
			Connection con=DriverManager.getConnection(url,user,pass);
			java.sql.DatabaseMetaData db=con.getMetaData();
			
			
			System.out.println("DriverName:-"+db.getDriverName());
			System.out.println("product name:-"+db.getDatabaseProductName());
			System.out.println("product version:-"+db.getDatabaseProductVersion());
			System.out.println("Driver version:-"+db.getDriverVersion());
			System.out.println("Driver username:-"+db.getUserName());
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
