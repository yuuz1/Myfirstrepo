
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Updatedata {

	public static void update()throws Exception {
				String url= "jdbc:mysql://127.0.0.1:3306/java";
				String username  = "root";
				String password = "123456789";
				String query = "update table1 set name = 'suresh' where id = 10";
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement PSD = con.prepareStatement(query);
				PSD.executeUpdate();
				con.close();
	}
	
	public static void main (String[]args)throws Exception {
		
		update();
	}
	}

