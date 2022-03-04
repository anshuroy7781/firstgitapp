package fi.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserInput1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/dbjava","root","anshu@77");
    		Statement stInsert=connection.createStatement();
    		Scanner sc=new Scanner(System.in))
    {
    System.out.println("enter the name");
    String name=sc.next();
    
    System.out.println("enter password");
    String password=sc.next();
    
    System.out.println("enter the id");
    int id=sc.nextInt();
    
    StringBuffer insertQuery=new StringBuffer("insert into advjava values('");
    insertQuery.append(name);
    insertQuery.append("',')");
    insertQuery.append(password);
    insertQuery.append("','");
    insertQuery.append(id);
    insertQuery.append("')");
    
    	System.out.println(insertQuery);
    
    	
    }
    catch(SQLException sql)
    {
    	sql.printStackTrace();
    }
    		
    		
	}

}
