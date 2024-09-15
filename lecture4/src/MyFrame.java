import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.BorderFactory;

public class MyFrame extends JFrame  implements ActionListener{
    JButton button;
    JLabel label;
    MyFrame(){
        button = new JButton();
        button.setBounds(120,150,250,150);
        // button.addActionListener(e-> System.out.println("Button clicked"));
        button.addActionListener(this);
        button.setText("Click me");
        button.setFocusable(false);
        ImageIcon icon = new ImageIcon("image.png");
        ImageIcon icon2= new ImageIcon("image2.png");
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setIconTextGap(-10);
        button.setForeground(Color.CYAN);
        button.setBackground(Color.GRAY);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setBorder(BorderFactory.createEtchedBorder());
        label = new JLabel();
        label.setIcon(icon2);
        label.setVisible(false);
        label.setBounds(170,150,350,150);
        this.add(label);
        this.setVisible(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);   
        this.add(button);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            System.out.println("Button Clicked");
            // button.setEnabled(false); // button will be disabled after 1st click
            button.setVisible(false);
            label.setVisible(true);
        }
    }
}
