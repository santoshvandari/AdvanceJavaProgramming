import java.util.ArrayList;
import javax.swing.*;
class DataView{
    JTextField txt1,txt2;
    JButton save,disp;
    DefaultListModel lmodel;
    public DataView(){
        JFrame jf = new JFrame("Student Information");
        jf.setSize(500,500);
        jf.setLayout(null);
        jf.setVisible(true);

        JLabel lbl1 = new JLabel("Name");
        lbl1.setSize(80,30);
        lbl1.setLocation(20,30);
        jf.add(lbl1);

        txt1=new JTextField();
        txt1.setSize(100, 30);
        txt1.setLocation(120,30);
        jf.add(txt1);


        JLabel lbl2 = new JLabel("Subject");
        lbl2.setSize(80,30);
        lbl2.setLocation(20,60);
        jf.add(lbl2);

        txt2=new JTextField();
        txt2.setSize(100, 30);
        txt2.setLocation(120,60);
        jf.add(txt2);

        save = new JButton("Save");
        save.setSize(80,30);
        save.setLocation(30,100);
        jf.add(save);


        disp = new JButton("Display");
        disp.setSize(100,30);
        disp.setLocation(140,100);
        jf.add(disp);

        lmodel = new DefaultListModel(); 
        JList lst = new JList(lmodel);
        lst.setSize(300, 200);
        lst.setLocation(20,150);
        jf.add(lst);
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
    DataView view;
    ArrayList<DataModel> list;
    public DataController(){
        list = new ArrayList<>();
        view = new DataView();
        view.save.addActionListener(e->{
            DataModel model = new DataModel();
            String name = view.txt1.getText();
            String subject = view.txt2.getText();
            model.setName(name);
            model.setSubject(subject);
            list.add(model);
            JOptionPane.showMessageDialog(null, "Saved Successfully!");
        });
        view.disp.addActionListener(e->{
            for(DataModel st : list)
                view.lmodel.addElement("Name : "+st.getName()+" Subject : "+st.getSubject());
        });
    }
}

class MVCProgram{
    public static void main(String args[]){
        DataController obj = new DataController();
    }
}