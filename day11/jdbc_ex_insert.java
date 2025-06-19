package jdbc_ex;




	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;
	public class jdbc_ex_insert {


	public static void main(String[] args) throws ClassNotFoundException ,SQLException
	{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/test_db";
			String username="root";
			String password="";
			Connection con=DriverManager.getConnection(url, username, password);
			Statement stmt=con.createStatement();
			String query="insert into student values(1,'Sri',26),(2,'Zoe',45),(3,'kin',34)";
			stmt.executeUpdate(query);
			System.out.println("inserted successfully");
	}
	}

	//while(rs.next()) {
		//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
	//}




