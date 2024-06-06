import javax.swing.*;
class ImageDisplaying{
    public static void main(String args[]){
        JFrame frame = new JFrame("Displaying Image");
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon("img.jpeg");
        // Image newimg = img.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        // ImageIcon newImg=new ImageIcon(newimg);
        // JLabel lbl = new JLabel(newImg);
        JLabel lbl = new JLabel(img);
        lbl.setLocation(60,50);
        lbl.setSize(200,200);
        frame.add(lbl);
    }
}