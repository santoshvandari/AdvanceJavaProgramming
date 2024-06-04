import javax.swing.*;
import java.awt.*;

class MyComponent extends JComponent{
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.setFont(new Font("Verdana",Font.BOLD,22));
        g.drawString("Santosh Bhandari",200,150);
    }
}

class DisplayingString{
    public static void main(String[] args){
        JFrame frame = new JFrame("My Frame");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        MyComponent obj = new MyComponent();
        frame.add(obj);
        frame.setVisible(true);
    }
}