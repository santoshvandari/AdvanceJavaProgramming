import javax.swing.*;
import java.awt.*;
class DrawCircle extends Component{
    public void paint(Graphics g){
        Graphics2D obj = (Graphics2D)g;
        obj.setColor(Color.RED);
        obj.setStroke(new BasicStroke(10));
        obj.drawOval(30 , 40, 120, 120);
    }
}
class DrawingCircle{
    public static void main(String args[]){
        JFrame frame = new JFrame("Circle");
        frame.setVisible(true);
        frame.setSize(500,500);
        DrawCircle obj = new DrawCircle();
        frame.add(obj);
    }
}