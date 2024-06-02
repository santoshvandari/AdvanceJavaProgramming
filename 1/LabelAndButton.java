import java.awt.*;
import javax.swing.*;
class LabelAndButton{
    public static void main(String args[]){
        JFrame frame = new JFrame("Test Frame");
        frame.setSize(new Dimension(300,200));
        frame.setLocation(100,100);
        frame.setVisible(true);
        Container contentpane = frame.getContentPane();
        JLabel label = new JLabel("HERE IS A LABEL");
        contentpane.add(label,BorderLayout.NORTH);
        JButton btn = new JButton("BUTTON");
        contentpane.add(btn,BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}