import javax.swing.*;
import java.awt.*;
class DrawRectangle extends Component{
    public void paint(Graphics g){
        Graphics2D obj = (Graphics2D)g;
        obj.setColor(Color.RED);
        obj.setStroke(new BasicStroke(10));
        obj.fillRect(100, 20, 200, 50);
        obj.drawRect(100,20,200,50);
    }
}
class RectangleDraw{
    public static void main(String args[]){
        JFrame frame = new JFrame("Rectangle");
        frame.setVisible(true);
        frame.setSize(500,500);
        DrawRectangle obj = new DrawRectangle();
        frame.add(obj);
    }
}