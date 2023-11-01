import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class Getdata {

	public static void getdata()throws Exception {
				String url= "jdbc:mysql://127.0.0.1:3306/java";
				String username  = "root";
				String password = "123456789";
				String query = "select * from table1";
				Connection con = DriverManager.getConnection(url, username, password);
				Statement smt = con.createStatement();
				ResultSet rs = smt.executeQuery(query);
				while (rs.next()) {
					System.out.println("userid"+rs.getInt(1));
					System.out.println("username"+rs.getString(2));
					System.out.println("useraddress"+rs.getString(3));
					System.out.println("useremail"+rs.getString(4));
					
				
				}
				con.close();
	}
	
	public static void main (String[]args)throws Exception {
		
		getdata();
	}
	}
