import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.awt.Color;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);
        

        JLabel label1= new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50,50,200,200);

        JLabel label2= new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);
        label2.setBounds(100,100,200,200);

        JLabel label3= new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.YELLOW);
        label3.setBounds(150,150,200,200);

        // layeredPane.add(label1);
        // layeredPane.add(label2);
        // layeredPane.add(label3);

        // layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
        // layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER);
        // layeredPane.add(label3, JLayeredPane.DRAG_LAYER);

        layeredPane.add(label1,Integer.valueOf(1));
        layeredPane.add(label2, Integer.valueOf(0));
        layeredPane.add(label3, Integer.valueOf(2));

        frame.add(layeredPane);
        frame.setVisible(true);
    }
}