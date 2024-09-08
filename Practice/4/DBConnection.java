import java.sql.*;

public class DBConnection {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","");
            if(con!=null){
                System.out.println("Database Connected Successfully");
            }
            Statement smt = con.createStatement();
            String query="SELECT * FROM Student;";
            ResultSet rs=smt.executeQuery(query);

            System.out.println("ID\tName");
            while(rs.next()){
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
            }

        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
