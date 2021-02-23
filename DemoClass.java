package database;
import java.sql.*;
public class DemoClass {

	public static void main(String arg[]) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/demo";
		String user="root";
		String pass="Pola@1234";
		String query ="select name from user where id=3;";	
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery(query);
		rs.next();
		String name = rs.getString("name");
		System.out.println(name);
		st.close();
		con.close();
	}
}
