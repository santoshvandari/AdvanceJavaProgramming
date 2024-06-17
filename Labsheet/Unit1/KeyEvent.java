import javax.swing.*;
import java.awt.event.*;;
public class KeyEvent {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Key Listener");
        jf.setLayout(null);
        jf.setSize(500,500);
        jf.setVisible(true);

        JTextArea text=new JTextArea();
        text.setSize(200, 100);
        text.setLocation(100,100);
        jf.add(text);

        JLabel res = new JLabel();
        res.setLocation(100,250);
        res.setSize(100, 30);

        jf.add(res);

        text.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
                res.setText("Typing");
            }
        });
  

        
    }
}
