import java.awt.*;
import javax.swing.*;

public class DrawingRectangle extends JComponent{
    public void paint(Graphics g){
        Graphics2D g2=(Graphics2D) g;
        g2.setColor(Color.BLUE);
        g2.drawRect(20, 20, 100, 80);
    }
    public static void main(String[] args) {
        JFrame jf = new JFrame("Drawing Rectangle");
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.add(new DrawingRectangle());
    }
}
