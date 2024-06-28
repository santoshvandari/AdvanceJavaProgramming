import javax.swing.*;

public class DisplayingImages {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Displaying Image");
        jf.setSize(500, 500);
        ImageIcon image = new ImageIcon("./img.png");
        JLabel lbl = new JLabel(image);
        lbl.setSize(500, 500);
        jf.add(lbl);
        jf.setVisible(true);
    }
}
