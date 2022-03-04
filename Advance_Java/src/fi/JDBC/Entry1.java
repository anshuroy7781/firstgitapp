package fi.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Entry1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/dbjava","root","anshu@77");
		Statement stInsert=connection.createStatement();
		{
			int noofRecords=stInsert.executeUpdate("insert into advjava values('dac1212','dacs@1234','50')");
					
			System.out.println("record inserted successfully " + noofRecords);
			
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
	}

}
