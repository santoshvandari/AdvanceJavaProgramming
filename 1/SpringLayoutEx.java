import java.awt.*;
import javax.swing.*;

//Driver Class
public class SpringLayoutEx {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Spring Layout Example");
        jf.setSize(300, 200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        Container cp = jf.getContentPane();

        // adding spring layout
        SpringLayout spl = new SpringLayout();
        cp.setLayout(spl);

        // creating buttons
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        cp.add(btn1);
        cp.add(btn2);
        cp.add(btn3);
        
        // adding constraints
        // for button 1
        spl.putConstraint(SpringLayout.WEST, btn1,
                24, SpringLayout.WEST, cp);
        spl.putConstraint(SpringLayout.NORTH, btn1,
                9, SpringLayout.NORTH, cp);
        // for button 2
        spl.putConstraint(SpringLayout.WEST, btn2,
                49, SpringLayout.WEST, cp);
        spl.putConstraint(SpringLayout.NORTH, btn2,
                10, SpringLayout.SOUTH, btn1);
        // for button 3
        spl.putConstraint(SpringLayout.WEST, btn3,
                45, SpringLayout.EAST, btn1);
        spl.putConstraint(SpringLayout.NORTH, btn3,
                9, SpringLayout.NORTH, cp);
        jf.setVisible(true);
    }
}