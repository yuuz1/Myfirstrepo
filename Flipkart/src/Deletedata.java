
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Deletedata {

    public static void Delete() throws Exception {
        String url = "jdbc:mysql://localhost:3306/java"; // replace '127.0.0.1' with 'localhost'
        String username = "root";
        String password = "123456789";
        String query = "delete from table1 where id=10 "; // corrected the SQL query syntax
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement pSD = con.prepareStatement(query);
        pSD.executeUpdate();
        con.close();
    }

    public static void main(String args[]) throws Exception {
    	Delete();
    }
}
