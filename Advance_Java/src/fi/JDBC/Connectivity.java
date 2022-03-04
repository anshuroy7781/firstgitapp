package fi.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.sql.Statement;

public class Connectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Connection connection = null;
    Statement stselect=null;
    ResultSet result=null;
    
    //1.load the db driver
    try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    //2.open db connection
    connection=DriverManager.getConnection("jdbc:mysql://localhost/dbjava","root","anshu@77");
    
    //3.create a statement 
    stselect=connection.createStatement();
    
    //4.fire the quiry
    result=stselect.executeQuery("select* from dbjava");
    
    //5.iterate through resultset
    while(result.next());
    {
    	System.out.println(result.getString(1));
    	System.out.println(result.getString(2));
    	System.out.println(result.getString(3));
    	//System.out.println(result.getString(4));
    	System.out.println("===================");
    	
    }
	}catch (ClassNotFoundException e) 
    {
		e.printStackTrace();
	}catch (SQLException e) {
		e.printStackTrace();
	
	}
	finally
	{
		try {
			if(result!=null)
				result.close();
			if(stselect!=null)
				stselect.close();
				if(connection!=null)
				connection.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		}
    
	}

}
