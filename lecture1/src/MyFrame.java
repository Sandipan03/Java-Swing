import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;

public class MyFrame extends JFrame{
    MyFrame(){
        this.setVisible(true);
    this.setSize(420, 420);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("My First JFrame");
    ImageIcon icon= new ImageIcon("image.png");
    this.setIconImage(icon.getImage());
    // frame.getContentPane().setBackground(Color.green);
    // frame.getContentPane().setBackground(new Color(0,0,0));
    this.getContentPane().setBackground(new Color(0x123456));
    }
    
}
