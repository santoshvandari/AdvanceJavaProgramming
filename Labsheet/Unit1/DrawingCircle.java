import java.awt.*;
import javax.swing.*;

public class DrawingCircle extends JComponent{
    public void paint(Graphics g){
        Graphics2D g2=(Graphics2D) g;
        g2.setColor(Color.BLUE);
        g2.drawOval(200, 200, 100, 100);
    }
    public static void main(String[] args) {
        JFrame jf = new JFrame("Drawing Oval");
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.add(new DrawingCircle());
    }
}
