import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
public class RegistrationForm {
    public static void main(String args[]){
        JFrame jf = new JFrame("Registration Form");
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setLayout(null);


        JLabel lbl1 = new JLabel("Username: ");
        lbl1.setSize(100,30);
        lbl1.setLocation(20,100);
        jf.add(lbl1);


        JTextField usr = new JTextField();
        usr.setSize(100,30);
        usr.setLocation(120,100);
        jf.add(usr);




        JLabel lbl2 = new JLabel("Email: ");
        lbl2.setSize(100,30);
        lbl2.setLocation(20,200);
        jf.add(lbl2);



        JTextField email = new JTextField();
        email.setSize(100,30);
        email.setLocation(120,200);
        jf.add(email);


        JButton save = new JButton("Save");
        save.setSize(100,50);
        save.setLocation(40,300);
        jf.add(save);

        JButton exit1 = new JButton("Exit");
        exit1.setSize(100,50);
        exit1.setLocation(300,300);
        jf.add(exit1);


        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usr.getText();
                String emailAddress = email.getText();

                // Database connection and insert logic

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcasecb", "root", "");
                    // Prepare SQL statement
                    String sql = "INSERT INTO Student(username, email) VALUES('"+username+"','"+emailAddress+"');";
                    try{

                        Statement smt = conn.createStatement();
                        smt.executeUpdate(sql); 
                        System.out.println("Data Inserted Successfully");
                    }catch(Exception ex){
                        System.out.println(ex);
                    }

                  
                } catch (Exception ex) {
                    System.out.println(ex);
                } 
            }
        });
        exit1.addActionListener(e->{
                System.exit(0);
        });


    }
}
