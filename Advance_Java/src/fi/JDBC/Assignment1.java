package fi.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/dbjava", "root", "anshu@77");
				PreparedStatement psInsert = connection.prepareStatement("insert into userform values(?,?,?,?,?)");
				PreparedStatement ps = connection.prepareStatement("select*from userform where city=?");

				PreparedStatement psUpdate = connection.prepareStatement("update userform set password=? where name=?");

				PreparedStatement psusername = connection.prepareStatement("select*from userform where UserName=?");) {
			int choice;
			do {
				Scanner sc = new Scanner(System.in);

				System.out.println("menu driven prog");
				System.out.println("1.register a user");
				System.out.println("2.list all users based on city");
				System.out.println("3.update password of a user");
				System.out.println("4.display user info based on user name");
				System.out.println("5.exit");
				System.out.println("enter your choice");
				choice = sc.nextInt();

				switch (choice) {
				case 1: {
					System.out.println("enter User Name");
					String username = sc.next();

					System.out.println("enter password");
					String password = sc.next();

					System.out.println("enter Name");
					String name = sc.next();

					System.out.println("enter the mail");
					String Email = sc.next();

					System.out.println("enter city name");
					String City = sc.next();

					psInsert.setString(1, username);
					psInsert.setString(2, password);
					psInsert.setString(3, name);
					psInsert.setString(4, Email);
					psInsert.setString(5, City);

					psInsert.executeUpdate();
					System.out.println("successfully inserted");

				}
					break;
				case 2: {
					System.out.println("enter city name");
				}
					String City = sc.next();

					ps.setString(1, City);

					ResultSet res = ps.executeQuery();

					while (res.next()) {
						System.out.println("username: " + res.getString(1));
						System.out.println("password: " + res.getString(2));
						System.out.println("name: " + res.getString(3));
						System.out.println("city: " + res.getString(4));

					}
					System.out.println("successfull displayed");
					break;
				case 3: {
					System.out.println("enter password");
					String password = sc.next();

					System.out.println("enter the name");
					String name = sc.next();

					psUpdate.setString(1, password);
					psUpdate.setString(2, name);

					psUpdate.executeUpdate();

					System.out.println("data updated successfully");

				}
					break;
				case 4: {
					System.out.println("enter username: ");
					String username = sc.next();

					psusername.setString(1, username);

					ResultSet res1 = psusername.executeQuery();
					while (res1.next())
						;
					{
						System.out.println("username: " + res1.getString(1));
						System.out.println("password: " + res1.getString(2));
						System.out.println("name: " + res1.getString(3));
						System.out.println("city: " + res1.getString(4));
					}

				}
					break;

				case 5: {
					System.out.println("exit program");
					return;
				}
				}
			} while (choice < 5);
		} catch (SQLException sql) {
			sql.printStackTrace();
		}

	}

}
