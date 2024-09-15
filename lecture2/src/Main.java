import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Main {
    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        // frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Learning Labels");
        ImageIcon image = new ImageIcon("image.png");
        JLabel label = new JLabel();
        label.setText("Hey there! This is me ");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setForeground(Color.green);
        label.setFont(new Font("MV Boli", Font.ITALIC, 50));
        label.setIconTextGap(-10);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        Border border = BorderFactory.createLineBorder(Color.green,3);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(125,125,250,250);
        // frame.setLayout(null);
        frame.add(label);
        frame.pack();
    }
}
