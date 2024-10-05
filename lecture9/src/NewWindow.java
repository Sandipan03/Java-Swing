import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello!");

    NewWindow(){
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        label.setBounds(0,0,100,50);
        label.setFont(new Font(null, Font.PLAIN, 25));
        
        frame.add(label);

        frame.setVisible(true);


    }
}
