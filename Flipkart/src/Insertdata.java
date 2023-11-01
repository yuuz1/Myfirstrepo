import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insertdata {

    public static void insert() throws Exception {
        String url = "jdbc:mysql://localhost:3306/java"; // replace '127.0.0.1' with 'localhost'
        String username = "root";
        String password = "123456789";
        String query = "INSERT INTO table1 VALUES (?,?,?,?)"; // corrected the SQL query syntax
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement pSD = con.prepareStatement(query);
        pSD.setInt(1, 11); // set the parameters correctly
        pSD.setString(2, "vishnu");
        pSD.setString(3, "kochi");
        pSD.setString(4, "Vishnu@gmail.com");
        pSD.executeUpdate();
        con.close();
    }

    public static void main(String args[]) throws Exception {
        insert();
    }
}