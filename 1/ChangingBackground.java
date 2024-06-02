import java.awt.*;
import javax.swing.*;
class ChangingBackground{
    public static void main(String args[]){
        JFrame frame = new JFrame("Test Frame");
        frame.setSize(new Dimension(300,200));
        frame.setLocation(100,100);
        frame.setVisible(true);
        Container contentpane = frame.getContentPane();
        contentpane.setBackground(Color.red);
        frame.setVisible(true);
    }
}