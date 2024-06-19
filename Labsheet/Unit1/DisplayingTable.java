import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class DisplayingTable {
    public static void main(String args[]){
        JFrame jf = new JFrame();
        jf.setSize(500,500);
        jf.setLayout(null);
        jf.setVisible(true);

        String cols[]={"Name","Address"};
        DefaultTableModel df = new DefaultTableModel(cols,0);
        JTable jt = new JTable(df);
        jt.setSize(300,300);
        jt.setLocation(100,100);

        df.addRow(new Object[]{"Santosh Bhandari","Kanakai-07"});
        df.addRow(new Object[]{"Manoj Dahal","Kanakai-03"});
        df.addRow(new Object[]{"Ayush Oli","Birtamode-03"});

        jf.add(jt);
    }
    
}
