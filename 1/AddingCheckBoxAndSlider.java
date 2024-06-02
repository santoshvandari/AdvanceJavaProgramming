import java.awt.*;
import javax.swing.*;
class AddingCheckBoxAndSlider{
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
        String[] options={"option1","option2","option3"};
        JList lst = new JList(options);
        contentpane.add(lst,BorderLayout.CENTER);
        JCheckBox cbox = new JCheckBox("Check");
        contentpane.add(cbox,BorderLayout.WEST);
        JSlider slider = new JSlider();
        contentpane.add(slider,BorderLayout.EAST);
        frame.setVisible(true);
    }
}