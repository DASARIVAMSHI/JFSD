package klh.edu.spring.JDBC.SPRING_JDBC;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class App 
{
    public static void main( String[] args )
    {
    	DriverManagerDataSource ds =new DriverManagerDataSource();
    	ds.setUrl("jdbc:mysql://localhost:3306/bookstore");
    	ds.setUsername("root");
    	ds.setPassword("root");
    	JdbcTemplate jt=new JdbcTemplate(ds);
    	String sql="insert into book(title,author,price)values(?,?,?)";
    	int res=jt.update(sql,"Ep","raju",9);
    	//String sql="delete from book where bid=?";
    	//int res=jt.update(sql,1);
    	//String sql="update book set author=? where bid=?";
    	//int res=jt.update(sql,"kumar",3);
    	if(res>0) {
    		System.out.println("sucessfully inserted");
    	}
    		
    	
    	
    	
    	
    	
    	
    }
}
