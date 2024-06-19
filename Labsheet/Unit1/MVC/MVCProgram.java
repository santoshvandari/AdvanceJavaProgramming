// 
import java.awt.Label;
import java.awt.event.*;
import javax.swing.*;

class DataView{
    JTextField txt1,txt2;
    JButton save,disp;
    JLabel res;
    DataView(){
        JFrame jf = new JFrame("Student Information");
        jf.setSize(500,500);
        jf.setLayout(null);
        jf.setVisible(true);

        JLabel lbl1 = new JLabel("Name");
        lbl1.setSize(80,30);
        lbl1.setLocation(20,30);
        jf.add(lbl1);

        JTextField txt1=new JTextField();
        txt1.setSize(100, 30);
        txt1.setLocation(120,30);
        jf.add(txt1);


        JLabel lbl2 = new JLabel("Subject");
        lbl2.setSize(80,30);
        lbl2.setLocation(20,60);
        jf.add(lbl2);

        JTextField txt2=new JTextField();
        txt2.setSize(100, 30);
        txt2.setLocation(120,60);
        jf.add(txt2);

        JButton save = new JButton("Save");
        save.setSize(80,30);
        save.setLocation(30,100);
        jf.add(save);


        JButton disp = new JButton("Display");
        disp.setSize(100,30);
        disp.setLocation(140,100);
        jf.add(disp);

        JLabel res = new JLabel();
        res.setSize(300,30);
        res.setLocation(30,200);
        jf.add(res);
    }
}

class DataModel{
    private String name,subject;
    public void setName(String name){
        this.name=name;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }
    public String getName(){
        return this.name;
    } 
    public String getSubject(){
        return this.subject;
    }
}

class DataController{
    DataController(){
        DataView view = new DataView();
        DataModel model = new DataModel();
        view.save.addActionListener(e->{
            String name = view.txt1.getText();
            String subject = view.txt2.getText();
            System.out.println("Save Btn Clicked");
            model.setName(name);
            model.setSubject(subject);
            JOptionPane.showMessageDialog(null, "Saved Successfully!");
        });

        view.disp.addActionListener(e->{
            String name = model.getName();
            String subject = model.getSubject();
            view.res.setText("Name : "+name+" Subject : "+subject);
        });
    }
}



class MVCProgram{
    public static void main(String args[]){
        DataController obj = new DataController();

    }
}