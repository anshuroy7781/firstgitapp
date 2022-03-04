package fi.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/dbjava","root","anshu@77");
    Statement stInsert=connection.createStatement();
    		
    Scanner sc=new Scanner(System.in))
    		{
    			System.out.println("enter the name");
    			String name=sc.next();
    			
    			System.out.println("enter the password ");
    			String password=sc.next();
    			
    			System.out.println("enter the id");
    			int id=sc.nextInt();
    			
    			String insertQuery="insert into advjava values('" + name + "','"+ password + "','"+ id + "')";
    			
    			System.out.println(insertQuery);
    			stInsert.execute(insertQuery);
    			
    			System.out.println("record inserted successfully");
    			
    	
    		}
    		catch(SQLException sql)
    		{
    			sql.printStackTrace();
    		}
    		
	}

}
