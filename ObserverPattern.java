import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.math.BigInteger;

public class ObserverPattern {
    private static JFrame frame;
    public static void Show(){
        frame = new JFrame("Base Change");
        frame.setLayout(new GridLayout(3,5));

        Label a,b,c;
        a= new Label("Binary");
        b= new Label("HexaDecimal");
        c= new Label("Octal");
        frame.add(a);
        frame.add(b);
        frame.add(c);


        frame.setSize(1000,150);
        Label binary= new Label();
        //binary.setColumns(30);
        frame.add(binary);

        Label hexa = new Label();
        //hexa.setColumns(30);
        frame.add(hexa);

        Label octal = new Label();
        //octal.setColumns(30);
        frame.add(octal);

        Label label = new Label("Enter Decimal");
        frame.add(label);

        JTextArea decimal = new JTextArea();
        frame.add(decimal);

        JButton submit = new JButton("Submit");
        frame.add(submit);
        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String data = decimal.getText();
                    int dec = Integer.parseInt(data);

                    binary.setText(Integer.toBinaryString(dec));
                    hexa.setText(Integer.toHexString(dec));
                    octal.setText(Integer.toOctalString(dec));




                }catch (Exception ee){
                    binary.setText("Invalid");
                    hexa.setText("Invalid");
                    octal.setText("Invalid");
                }
            }
        });

        frame.setVisible(true);


    }

    public static void main(String[] args) {
        Show();
    }
}