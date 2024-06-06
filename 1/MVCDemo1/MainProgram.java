import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

// Model Place
class StudentModel {
    private int sid;
    private String name;
    public void setId(int sid) {
        this.sid=sid;
    }
    public int getId() {
        return sid;
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
}


//View Place
class StudentView {
    public JLabel lbl1, lbl2, lbl3;
    public JTextField txt1, txt2;
    public JButton btn1, btn2;
    // required for creating a empty list
    DefaultListModel lmodel;

    public StudentView() {
        JFrame jf = new JFrame("Student Form");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setLocationRelativeTo(null);

        lbl1 = new JLabel("Enter Sid:");
        lbl1.setSize(100, 30);
        lbl1.setLocation(20, 20);
        jf.add(lbl1);

        txt1 = new JTextField();
        txt1.setSize(120, 30);
        txt1.setLocation(100, 20);
        jf.add(txt1);

        lbl2 = new JLabel("Enter Name:");
        lbl2.setSize(100, 30);
        lbl2.setLocation(20, 60);
        jf.add(lbl2);

        txt2 = new JTextField();
        txt2.setSize(120, 30);
        txt2.setLocation(100, 60);
        jf.add(txt2);

        btn1 = new JButton("Save");
        btn1.setSize(100, 20);
        btn1.setLocation(50, 110);
        jf.add(btn1);

        btn2 = new JButton("Display");
        btn2.setSize(100, 20);
        btn2.setLocation(160, 110);
        jf.add(btn2);
        
        // creating a JList
        lmodel = new DefaultListModel();
        JList jl = new JList(lmodel);
        jl.setSize(200, 100);
        jl.setLocation(20, 140);
        jf.add(jl);
        jf.setVisible(true);
    }
}


// Controller Place
class StudentController {
    StudentView v;
    // for storing multiple data
    ArrayList<StudentModel> data;

    public void initController() {
        //model initialization not required & will be initialized in add button clicked
        //initializing view
        v=new StudentView();
        //initializing ArrayList
        data=new ArrayList<>();
        //registering events
        v.btn1.addActionListener(e->saveClicked());
        v.btn2.addActionListener(e->displayClicked());
    }

    public void saveClicked() {
        int sid = Integer.parseInt(v.txt1.getText());
        String name = v.txt2.getText(); // transferring to model
        StudentModel m = new StudentModel();
        m.setId(sid);
        m.setName(name);
        // adding model to ArrayList
        data.add(m);
        JOptionPane.showMessageDialog(null, "Saved Successfully!");
    }

    public void displayClicked() {
        // clearing previous data'
        v.lmodel.clear();
        // getting data from ArrayList
        for (StudentModel st : data) {
            // System.out.println(st.getId()+" "+st.getName());
            v.lmodel.addElement(st.getId() + " " + st.getName());
        }
    }
}


// Main Program
class MainProgram{
    public static void main(String[] args){
        StudentController cont=new StudentController();
        cont.initController();
    }
}