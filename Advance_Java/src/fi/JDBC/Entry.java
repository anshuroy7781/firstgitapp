package fi.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Entry {
	public static void main(String[] args) {
		Connection connection = null;
		Statement stSelect = null;
		ResultSet result = null;
		try {
			// Step 1 : Load the DB Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// "jdbc:mysql:
			// Step 2: Open DB Connection
			// connection = DriverManager.getConnection(url,username,password);
			connection = DriverManager.getConnection("jdbc:mysql://localhost/dbjava","root","anshu@77");
			// Step 3 : Create a Statement
			stSelect = connection.createStatement();
			// Step 4 : Fire the query
			result = stSelect.executeQuery("select *from advjava");
			// Step 5 : iterate through the resultset
			while (result.next()) {
				System.out.println(result.getString(1));
				// TRIAL MODE − Click here for more information
				System.out.println(result.getString(2));
//				System.out.println(result.getString(3));
//				System.out.println(result.getString(4));
				System.out.println("******************************");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Step 6 : Close the resources
			try {
				if (result != null)
					result.close();
				if (stSelect != null)
					stSelect.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
