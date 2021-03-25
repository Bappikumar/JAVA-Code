

import java.awt.*;
import java.awt.event.*;



class Addition extends Frame implements ActionListener
{
    Label l1,l2,l3,l4;
    TextField t1,t2,t3;
    Button b1,b2;
    
    Addition()
    {
        super("Addition of two numbers");
        setLayout(null);
        setSize(500,400);
        setVisible(true);
        
        l1=new Label("First Number:");
        l2=new Label("2nd Number:");
        l3=new Label("RESULT :");
        l4=new Label(null);

        t1=new TextField();
        t2=new TextField();
        t3=new TextField();
        b1=new Button("SUBMIT");


        l1.setBounds(100,50,120,20);
        add(l1);
        t1.setBounds(240,50,50,20);
        add(t1);
        l2.setBounds(100,80,130,20);
        add(l2);
        t2.setBounds(240,80,50,20);
        add(t2);
        l3.setBounds(100,110,100,20);
        add(l3);

        t3.setBounds(240,110,50,20);
        add(t3);
        b1.setBounds(240,150,50,20);
        add(b1);

        b1.addActionListener(this);


        addWindowListener( new WindowAdapter() {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae)
    {
        float a,b,c;
        if(ae.getSource()==b1)
        {
            a=Float.parseFloat(t1.getText());
            b=Float.parseFloat(t2.getText());
            c=a+b;
            t3.setText(Float.toString(c));
        }
        else
        {
            t1.setText(null);
            t2.setText(null);
            t3.setText(null);
        }
    }

    public static void main(String s[])
    {
        Addition ob=new Addition();
       
    }
}