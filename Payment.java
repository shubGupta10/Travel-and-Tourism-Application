import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Payment extends JFrame implements ActionListener {

    JButton pay, Abort;
    Payment(){

        setBounds(500, 200, 800, 600);
        setLayout(null);
        setVisible(true);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(800, 555, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 555);
        add(image);

        pay = new JButton("Pay");
        pay.setBounds(80, 450,80, 40);
        pay.setForeground(Color.WHITE);
        pay.setBackground(Color.BLACK);
        pay.addActionListener(this);
        image.add(pay);


        Abort = new JButton("Abort");
        Abort.setBounds(650, 450, 80,40);
        Abort.setForeground(Color.WHITE);
        Abort.setBackground(Color.BLACK);
        Abort.addActionListener(this);
        image.add(Abort);



    }



    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == pay){

            JOptionPane.showMessageDialog(null, "Payment Successful");

        } else {
            setVisible(false);
        }

    }


    public static void main(String[] args){

        new Payment();
    }

}
