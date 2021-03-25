

import java.awt.GridLayout;
import java.awt.Insets;
 
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

 
public class ButtonExample {
 
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Hello Swing");
        JLabel label = new JLabel("I'm a JLabel", JLabel.CENTER);
        JPanel panel = new JPanel();
         
       
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxlayout);
        panel.setBorder(new EmptyBorder(new Insets(45, 70, 45, 70)));
         
        
        JButton jb1 = new JButton("Button 1");
        JButton jb2 = new JButton("Button 2");      
        JButton jb3 = new JButton("Button 3");
         
        
        panel.add(jb1); 
        panel.add(jb2);
        panel.add(jb3);
        
        frame.setLayout(new GridLayout(2, 1));
        frame.add(label);
        frame.add(panel);
         
        
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
 
    }
 
}