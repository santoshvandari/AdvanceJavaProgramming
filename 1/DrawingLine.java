import javax.swing.*;
import java.awt.*;

class DrawLine extends Component{
    public void paint(Graphics g){
        Graphics2D obj = (Graphics2D)g;
        obj.setColor(Color.RED);
        obj.setStroke(new BasicStroke(10));
        obj.drawLine(100,20,150,20);

    }
}

class DrawingLine{
    public static void main(String args[]){
        JFrame frame = new JFrame("Drawing Line");
        frame.setSize(500,500);
        frame.setVisible(true);
        DrawLine line = new DrawLine();
        frame.add(line);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}