import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchScreen implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton("New Window");
    LaunchScreen(){
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        button.setBounds(100,160,200,40);
        button.addActionListener(this);
        button.setFocusable(false);
        frame.add(button);

        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            frame.dispose();
            new NewWindow();
        }
    }
}
