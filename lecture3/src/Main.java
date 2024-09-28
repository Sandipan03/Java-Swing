import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;

public class Main{
    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(750, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Learning panels");
        JLabel label = new JLabel();
        label.setText("Hi");
        ImageIcon icon = new ImageIcon("image.png");
        label.setIcon(icon);
        // label.setHorizontalTextPosition(JLabel.LEFT); // lines 20 and 21 work only when layout manager of panel is set to border layout
        // label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setBounds(200, 0, 150, 150);
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        // greenPanel.setLayout(new BorderLayout());
        greenPanel.setLayout(null);
        greenPanel.add(label);
        frame.setLayout(null);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}