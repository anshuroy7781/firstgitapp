package fi.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try(Connection connection =DriverManager.getConnection
    		("jdbc:mysql://localhost/dbjava","root","anshu@77");
//    		//PreparedStatement psInsert=connection.prepareStatement
//    				("select*from advjava where name=? and password=?");
    		PreparedStatement psUpdate=connection.prepareStatement
    				("update advjava set password=? where name=?");
    		Scanner sc=new Scanner(System.in))
    {
//    	System.out.println("enter the password");
//    	String password=sc.next();
    	
    	System.out.println("enter the name");
    	String name=sc.next();
    	
    	psUpdate.setString(1, "dnyanu123");
    	psUpdate.setString(2, "anshu ");
    	psUpdate.executeUpdate();
    	
	}
    		catch(SQLException sql)
    		{
    			sql.printStackTrace();
    		}
    		
	}

}
