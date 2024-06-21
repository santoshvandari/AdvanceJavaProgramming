// GUI CRUD Operation
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;

class GUIDesign{
    DefaultTableModel tmodel;
    JButton display,save,delete,update;
    JTextField id,name;
    GUIDesign(){
        JFrame jf = new JFrame("CRUD Operation");
        jf.setSize(1500, 800);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setVisible(true);


        JLabel txt1=new JLabel("ID");
        txt1.setSize(50,30);
        txt1.setLocation(20,30);
        jf.add(txt1);


        id = new JTextField();
        id.setSize(100,30);
        id.setLocation(120,30);
        jf.add(id);

        JLabel txt2=new JLabel("Name");
        txt2.setSize(50,30);
        txt2.setLocation(20,70);
        jf.add(txt2);


        name = new JTextField();
        name.setSize(100,30);
        name.setLocation(120,70);
        jf.add(name);

        save = new JButton("Save");
        save.setSize(70,40);
        save.setLocation(20,160);
        jf.add(save);

        delete = new JButton("Delete");
        delete.setSize(100,40);
        delete.setLocation(100,160);
        jf.add(delete);


        update = new JButton("Update");
        update.setSize(100,40);
        update.setLocation(210,160);
        jf.add(update);

        display = new JButton("Display");
        display.setSize(90,40);
        display.setLocation(320,160);
        jf.add(display);


        String cols[]={"ID","Name"};
        tmodel= new DefaultTableModel(cols,0);
        JTable table = new JTable(tmodel);
        JScrollPane jp = new JScrollPane(table);
        jp.setSize(500,500);
        jp.setLocation(700,50);
        jf.add(jp);
    }

}

class CRUD {
    Connection conn;
    Statement smt;
    // Database Connection Code
    void DataBaseConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","");
            smt= conn.createStatement();
            System.out.println("Database Connected Successfully");
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    // Reading Data From the Database
    void ReadData(GUIDesign obj){
        String sql = "SELECT * FROM Student;";
        try{
            ResultSet rs = smt.executeQuery(sql);
            obj.tmodel.setRowCount(0);
            while(rs.next()){
                obj.tmodel.addRow(new Object[]{rs.getInt(1),rs.getString(2)});
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    // Inserting Data in the Database
    void InsertData(int id, String name){
        String sql = "INSERT INTO Student VALUES("+id+",'"+name+"');";
        System.out.println(sql);
        try{
           smt.executeUpdate(sql);
           JOptionPane.showMessageDialog(null,"Data Inserted Successfully");
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    // Updating Data in the Database
    void UpdateData(int id,String name){
        String sql = "UPDATE Student SET name='"+name+"' WHERE id="+id+";";
        try{
           smt.executeUpdate(sql);
           JOptionPane.showMessageDialog(null,"Data Updated Successfully");
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    // Deleting Data from the Database
    void DeleteData(int id){
        String sql = "DELETE FROM Student WHERE id="+id+";";
        try{
           smt.executeUpdate(sql);
           JOptionPane.showMessageDialog(null, "Data Deleted Successfully");
        }catch(Exception ex){
            System.out.println(ex);
        }
        
    }
    public static void main(String[] args) {
        GUIDesign obj = new GUIDesign();
        CRUD crud = new CRUD();
        crud.DataBaseConnection();
        crud.ReadData(obj);

        // For Saving the Data
        obj.save.addActionListener(e->{
            try{
                int id = Integer.parseInt(obj.id.getText());
                String name = String.valueOf(obj.name.getText());
                crud.InsertData(id, name);
            }catch(Exception ex){
                System.out.println(ex);
            }
        });
        // For Deleting the Data
        obj.delete.addActionListener(e->{
            try{
                int id = Integer.parseInt(obj.id.getText());
                crud.DeleteData(id);
            }catch(Exception ex){
                System.out.println(ex);
            }
        });
        // For Updating the Data
        obj.update.addActionListener(e->{
            try{
                int id = Integer.parseInt(obj.id.getText());
                String name = String.valueOf(obj.name.getText());
                crud.UpdateData(id, name);
            }catch(Exception ex){
                System.out.println(ex);
            }
        });
        // For Displaying the Data
        obj.display.addActionListener(e->{
            crud.ReadData(obj);
        });
    }
}
