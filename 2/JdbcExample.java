import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcExample {
    public static void main(String[] args) {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");



            // Connect to MySQL
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";  // replace with your MySQL username
            String password = "";  // replace with your MySQL password
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Database Connected Successfully");
            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
