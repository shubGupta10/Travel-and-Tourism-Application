

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.sql.SQLException;

public class SignUp extends JFrame implements ActionListener {

    JButton jb, jb2;

    JLabel jl, jl2, jl3, jl4, jl5;
    JTextField tf, tf2, tf3, tf4,tf5;
    Choice security;

    SignUp() {

        setBounds(350, 200, 900, 360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        JPanel jp = new JPanel();
        jp.setBounds(0, 0, 500, 400);
        jp.setBackground(new Color(133, 193, 233));
        jp.setLayout(null);
        add(jp);


        jl = new JLabel("Username");
        jl.setBounds(50, 20, 125, 25);
        jl.setFont(new Font("San SERIF", Font.BOLD, 14));
        jp.add(jl);

        tf = new JTextField("");
        tf.setBounds(190, 20, 180, 25);
        tf.setBorder(BorderFactory.createEmptyBorder());
        jp.add(tf);

        jl2 = new JLabel("Name");
        jl2.setBounds(50, 60, 125, 25);
        jl2.setFont(new Font("Tahoma", Font.BOLD, 14));
        jp.add(jl2);

        tf2 = new JTextField("");
        tf2.setBounds(190, 60, 180, 25);
        tf2.setBorder(BorderFactory.createEmptyBorder());
        jp.add(tf2);

        jl3 = new JLabel("Password");
        jl3.setBounds(50, 100, 125, 25);
        jl3.setFont(new Font("Tohama", Font.BOLD, 14));
        jp.add(jl3);

        tf4 = new JTextField("");
        tf4.setBounds(190, 100, 180, 25);
        tf4.setBorder(BorderFactory.createEmptyBorder());
        jp.add(tf4);

        jl4 = new JLabel("Security Question");
        jl4.setBounds(50, 140, 125, 25);
        jl4.setFont(new Font("Tohama", Font.BOLD, 14));
        jp.add(jl4);


        //so here we can make dropdown bar with help of choice class
        security = new Choice();
        security.add("Who is your Favourite Superhero");
        security.add("Who is your Favourite Marvel Character");
        security.add("Your Favorite Childhood superhero");
        security.add("Favorite Cricketer");
        security.setBounds(190, 140, 180, 25);
        jp.add(security);


        jl5 = new JLabel("Answer");
        jl5.setBounds(50, 180, 125, 25);
        jl5.setFont(new Font("Tohama", Font.BOLD, 14));
        jp.add(jl5);

        tf5 = new JTextField("");
        tf5.setBounds(190, 180, 180, 25);
        tf5.setBorder(BorderFactory.createEmptyBorder());
        jp.add(tf5);


        jb = new JButton("AddUser");
        jb.setBounds(60, 250, 120, 30);
        jb.setForeground(new Color(133, 193, 233));
        jb.setFont(new Font("Tohama", Font.BOLD, 14));
        jb.addActionListener(this);
        jb.setBackground(Color.BLACK);
        jp.add(jb);

        jb2 = new JButton("Back");
        jb2.setBounds(240, 250, 120, 30);
        jb2.setForeground(new Color(133, 193, 233));
        jb2.setBackground(Color.BLACK);
        jb2.setFont(new Font("Tohama", Font.BOLD, 14));
        jb2.addActionListener(this);
        jp.add(jb2);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));

        //here we scale the image to fit in the frame 2nd half:-
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);

        ImageIcon i3 = new ImageIcon(i2);

        JLabel jl6 = new JLabel(i3);
        jl6.setBounds(580, 50, 250, 250);
        add(jl6);


        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e1) {


        if (e1.getSource() == jb) {

            String username = tf.getText();
            String Name = tf2.getText();
            String Password = tf4.getText();
            String SecurityQuestion = security.getSelectedItem();
            String Answer = tf5.getText();

            String query = "insert into account values('"+username+"', '"+Name+"', '"+Password+"', '"+SecurityQuestion+"', '"+Answer+"' )";

            try{
                Connect c = new Connect();
                c.s.executeUpdate(query);


                JOptionPane.showMessageDialog(null, "Your Account Created Successfully");

                setVisible(false);
                new LoginPage();

            } catch(Exception e)
            {     e.printStackTrace();
            }



        } else if (e1.getSource() == jb2) {

            setVisible(false);
            new LoginPage();

        }
    }


    public static void main(String[] args) {


        SignUp sup = new SignUp();
    }

}


