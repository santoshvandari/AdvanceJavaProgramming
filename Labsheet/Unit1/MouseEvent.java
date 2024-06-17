import javax.swing.*;
import java.awt.event.*;;
public class MouseEvent {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Sum of Number");
        jf.setLayout(null);
        jf.setSize(500,500);
        jf.setVisible(true);

        // Number 1
        JTextField n1=new JTextField();
        n1.setSize(100, 30);
        n1.setLocation(100,100);
        jf.add(n1);
        // Number 2
        JTextField n2=new JTextField();
        n2.setSize(100, 30);
        n2.setLocation(100,150);
        jf.add(n2);

        // Buttom
        JButton sum = new JButton("Sum");
        sum.setSize(80, 30);
        sum.setLocation(150,200);
        jf.add(sum);

        // Jlabel
        JLabel res = new JLabel("Result");
        res.setLocation(100,250);
        res.setSize(100, 30);

        jf.add(res);

        sum.addActionListener(e->{
            int num1=Integer.parseInt(n1.getText());
            int num2=Integer.parseInt(n2.getText());
            res.setText("Sum : "+ String.valueOf(num1+num2));

        });
    }
}
