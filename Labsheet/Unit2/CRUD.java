
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.*;
import java.sql.*;

class GUIDesign{
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


        JTextField id = new JTextField();
        id.setSize(100,30);
        id.setLocation(120,30);
        jf.add(id);

        JLabel txt2=new JLabel("Name");
        txt2.setSize(50,30);
        txt2.setLocation(20,70);
        jf.add(txt2);


        JTextField name = new JTextField();
        name.setSize(100,30);
        name.setLocation(120,70);
        jf.add(name);

        JButton save = new JButton("Save");
        save.setSize(70,40);
        save.setLocation(20,160);
        jf.add(save);

        JButton delete = new JButton("Delete");
        delete.setSize(100,40);
        delete.setLocation(100,160);
        jf.add(delete);


        JButton update = new JButton("Update");
        update.setSize(100,40);
        update.setLocation(210,160);
        jf.add(update);

        JButton display = new JButton("Display");
        display.setSize(90,40);
        display.setLocation(320,160);
        jf.add(display);


        String cols[]={"ID","Name"};
        DefaultTableModel tmodel = new DefaultTableModel(cols,0);
        JTable table = new JTable(tmodel);
        JScrollPane jp = new JScrollPane(table);
        jp.setSize(500,500);
        jp.setLocation(700,50);
        jf.add(jp);





    }

}

public class CRUD {
    
    public void DataBaseConnection(){
        
    }

    public void ReadData(){

    }
    public void InsertData(){

    }
    public void UpdateData(){

    }
    public void DeleteData(){
        
    }
    public static void main(String[] args) {
        GUIDesign obj = new GUIDesign();
        
    }

}
