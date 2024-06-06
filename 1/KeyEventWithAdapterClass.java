import java.awt.event.*;
import javax.swing.*;
class KeyEventWithAdapterClass{
    public static void main(String args[]){
        JFrame frame = new JFrame("Key Event");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JTextField txt=new JTextField();
        txt.setSize(200, 50);
        txt.setLocation(60, 100);
        frame.add(txt);

        JLabel lbl = new JLabel("Status");
        lbl.setSize(100,50);
        lbl.setLocation(100,150);
        frame.add(lbl);


        txt.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                lbl.setText("Key Typed!");
                System.out.println(txt.getText());
            }
        });
    }
}