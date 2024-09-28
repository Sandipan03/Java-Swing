import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;

public class Main{
    public static void main (String[] args){
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));
        // panel.setLayout(new FlowLayout()); // By default, panel has a default layout managaer of flowlayout. For frames, default is borderlayout.
        // panel.setLayout(new FlowLayout(FlowLayout.LEADING)); // By default, panel has a default layout managaer of flowlayout. For frames, default is borderlayout.
        // panel.setLayout(new FlowLayout(FlowLayout.TRAILING)); // By default, panel has a default layout managaer of flowlayout. For frames, default is borderlayout.
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,10)); // By default, panel has a default layout managaer of flowlayout. For frames, default is borderlayout.
        panel.setBackground(Color.lightGray);
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);
        frame.setVisible(true);
    }
}