import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;



class UserNameInsertingDatabaseJava {
    public static void main(String args[]){
        JFrame jf = new JFrame("Database Connection");
        jf.setSize(500,500);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lbl = new JLabel("Username: ");
        lbl.setSize(100,20);
        lbl.setLocation(50,100);
        jf.add(lbl);


        JTextField username = new JTextField();
        username.setSize(200,20);
        username.setLocation(130,100);
        jf.add(username);


        JButton btnSave = new JButton("Save");
        btnSave.setSize(100,50);
        btnSave.setLocation(50,150);
        jf.add(btnSave);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","");
            btnSave.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    String name = username.getText();
                    String query = "INSERT INTO username(name) VALUES('"+name+"');";
                    try{

                        Statement smt = conn.createStatement();
                        smt.executeUpdate(query); 
                        System.out.println("Data Inserted Successfully");
                    }catch(Exception ex){
                        System.out.println(ex);
                    }

                }
            });

        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
