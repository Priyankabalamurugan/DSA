package jdbc_ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class jdbc_ex_delete {
	public static void main(String[] args) throws ClassNotFoundException ,SQLException
	{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/test_db";
			String username="root";
			String password="";
			Connection con=DriverManager.getConnection(url, username, password);
			Statement stmt=con.createStatement();
			String query="delete from student where id=1";
			stmt.executeUpdate(query);
			System.out.println("deleted successfully");
	}
	}

