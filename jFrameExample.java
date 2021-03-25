package javaCodeGeeks;
 
import javax.swing.JFrame;

 
public class jFrameExample {
 
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 250);
        frame.setVisible(true);
    }
 
}