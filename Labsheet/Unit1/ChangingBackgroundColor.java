import javax.swing.*;
import java.awt.*;
class ChangingBackgroundColor{
    public static void main(String args[]){
        JFrame frame = new JFrame("Changing Background");
        frame.setSize(200,200);
        Panel panel = new Panel();
        panel.setBackground(Color.CYAN);
        frame.add(panel);
        frame.setVisible(true);
    }
}