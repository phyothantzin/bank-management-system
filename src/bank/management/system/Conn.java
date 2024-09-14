package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
	Connection connection;
	Statement statement;

	public Conn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Soul@$1472");
			statement = connection.createStatement();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
