
import java.sql.*;
class DatabaseConnection{
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String db="jdbc:mysql://localhost:3306/bca";
            Connection con = DriverManager.getConnection(db, "root", "");
            Statement smt=con.createStatement();
            System.out.println("DataBase Connected Successfully");
            String sql="CREATE TABLE IF NOT EXISTS Student(id int, name varchar(30));";
            smt.execute(sql);
            System.out.println("Table Create Successfully");
            // Inserting
            String insert="INSERT INTO Student VALUES(1,'Santosh Bhandari'),(2,'Adi'),(3,'Krish')";
            smt.execute(insert);
            System.out.println("Data Insert Successfully");

            // Reading 

        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}