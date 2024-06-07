import java.awt.*;
import javax.swing.*;

//Driver Class
public class CardLayoutEx {
    public static void main(String[] args) {
        JFrame jf = new JFrame("My Frame");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);

        // creating jpanel to demonstrate cardlayout
        JPanel jp = new JPanel();
        jp.setSize(200, 80);
        jp.setLocation(80, 40);
        jp.setBackground(Color.CYAN);

        // adding cardlayout
        CardLayout card = new CardLayout(40, 30);
        jp.setLayout(card);
        JLabel lbl1 = new JLabel("Label 1");
        JLabel lbl2 = new JLabel("Label 2");
        JLabel lbl3 = new JLabel("Label 3");

        // adding level to cards
        jp.add("card1", lbl1);
        jp.add("card2", lbl2);
        jp.add("card3", lbl3);

        // creating another JPanel for buttons
        JPanel jp1 = new JPanel();
        jp1.setSize(300, 100);
        jp1.setLocation(40, 120);
        jp1.setLayout(new FlowLayout());
        JButton prev = new JButton("Previous");
        JButton next = new JButton("Next");
        JButton first = new JButton("First");
        JButton last = new JButton("Last");
        JButton show = new JButton("Show Card");
        jp1.add(prev);
        jp1.add(next);
        jp1.add(first);
        jp1.add(last);
        jp1.add(show);

        // adding panels to frame
        jf.add(jp);
        jf.add(jp1);
        
        // adding click event to buttons
        prev.addActionListener(e -> {
            // previous
            card.previous(jp);
        });
        next.addActionListener(e -> {
            // next
            card.next(jp);
        });
        first.addActionListener(e -> {
            card.first(jp);
        });
        last.addActionListener(e -> {
            card.last(jp);
        });
        show.addActionListener(e -> {
            card.show(jp, "card2");
        });
        jf.setVisible(true);
    }
}