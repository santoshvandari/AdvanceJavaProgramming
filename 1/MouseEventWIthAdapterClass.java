import javax.swing.*;
import java.awt.event.*;

class MouseEventWIthAdapterClass{
    public static void main(String args[]){
        JFrame frame = new JFrame("Mouse Event");
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn = new JButton("Click Me");
        btn.setSize(150,50);
        btn.setLocation(100,100);
        frame.add(btn);


        JLabel lbl=new JLabel("Result");
        lbl.setSize(100, 50);
        lbl.setLocation(150,150);
        frame.add(lbl);

        btn.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                lbl.setText("Mouse Clicked");
            }
            public void mousePressed(MouseEvent e) {
                lbl.setText("Mouse Pressed!");
            }
        });
    }
}


