// Write a GUI Program to find sum and difference of two integer numbers. Use two text fields for input and third text field for output. Your Program SHould display sum if the user presses the mouse and difference if the user releases the mouse. 

import javax.swing.*;
import java.awt.event.*;
public class MousePressAndReleased {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Mouse Event");
        jf.setLayout(null);
        jf.setSize(500,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

        JTextField num1= new JTextField();
        num1.setSize(100,20);
        num1.setLocation(30,30);
        jf.add(num1);



        JTextField num2 = new JTextField();
        num2.setSize(100, 20);
        num2.setLocation(30,60);
        jf.add(num2);

        JButton btn=new JButton("Calculate");
        btn.setSize(150,50);
        btn.setLocation(30,90);
        jf.add(btn);


        JTextField res = new JTextField();
        res.setSize(100, 20);
        res.setLocation(30,200);
        jf.add(res);


        btn.addMouseListener(new MouseAdapter(){
           
            public void mousePressed(MouseEvent e){
                int n1=Integer.parseInt(num1.getText().toString());
                int n2=Integer.parseInt(num2.getText().toString());
                res.setText("Sum = "+(n1+n2));
            }
            public void mouseReleased(MouseEvent e){
                int n1=Integer.parseInt(num1.getText().toString());
                int n2=Integer.parseInt(num2.getText().toString());
                res.setText("Difference = "+(n1-n2));
            }
        });
    }
}
