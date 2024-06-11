import javax.swing.*;
import java.sql.*;
import java.awt.event.*;


class UserRegistration {
    public static void main(String args[]) {
        JFrame jf = new JFrame("User Registration Form");
        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        // jf.setLocationRelativeTo(null);
        jf.setVisible(true);

        JLabel lbl1 = new JLabel("Username: ");
        lbl1.setSize(100, 30);
        lbl1.setLocation(20, 20);
        jf.add(lbl1);

        JTextField username = new JTextField();
        username.setSize(120, 30);
        username.setLocation(100, 20);
        jf.add(username);

        JLabel lbl2 = new JLabel("Email: ");
        lbl2.setSize(100, 30);
        lbl2.setLocation(20, 60);
        jf.add(lbl2);

        JTextField email = new JTextField();
        email.setSize(120, 30);
        email.setLocation(100, 60);
        jf.add(email);

        JButton btnsave = new JButton("Save");
        btnsave.setSize(100, 20);
        btnsave.setLocation(50, 110);
        jf.add(btnsave);

        JButton exit1 = new JButton("Exit");
        exit1.setSize(100, 20);
        exit1.setLocation(160, 110);
        jf.add(exit1);

        JLabel result = new JLabel();
        result.setSize(200, 30);
        result.setLocation(50, 150);

        try{
              // Load MySQL JDBC Driver
            Class.forName("com.mysql.jdbc.Driver");
              // Connect to MySQL
            String url = "jdbc:mysql://localhost:3306/javadb";
            String user = "root";  // replace with your MySQL username
            String password = "";  // replace with your MySQL password
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Database Connected Successfully");

            // Save Bution Action Perform 
            btnsave.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String user = username.getText();
                    String mail = email.getText();
                    String query = "INSERT INTO userdata(username,email) VALUES('"+user+"','"+mail+"');";
                    try{
                        Statement stmt = conn.createStatement();
                        stmt.executeUpdate(query);
                        System.out.println("Data Inserted Successfully");
                        result.setText("Data Inserted Successfully");
                        jf.add(result);
                        username.setText("");
                        email.setText("");
                    }catch(Exception ex){
                        System.out.println(ex);
                    }
    
                }
            });
        }catch(Exception ex){
            System.out.println(ex);
        }
       
        exit1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
    }
}