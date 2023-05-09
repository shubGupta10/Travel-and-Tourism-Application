//import com.mysql.cj.protocol.Resultset;

import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.sql.*;

public class ForgetPassword extends JFrame implements ActionListener {

    JLabel jl, jl2, jl3, jl4, jl5;
    JTextField tf, tf2,tf3, tf4, tf5;

    JButton jb, jb2, jb3;

    ForgetPassword(){

        setSize(850, 380);
        setLocation(350, 200);


        getContentPane().setBackground(Color.WHITE);



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));

        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);

        ImageIcon i3 = new ImageIcon(i2);


        JLabel image = new JLabel(i3);
        image.setBounds(560,70, 200, 200);
        add(image);







        JPanel P1 = new JPanel();

        P1.setBounds(30, 30, 500, 280);

        add(P1);
        P1.setLayout(null);



        jl = new JLabel("username");
        jl.setBounds(40, 20, 100, 25);
        jl.setFont(new Font("Tohama", Font.BOLD, 14));
        P1.add(jl);

        tf = new JTextField();
        tf.setBounds(200, 20, 150,25 );
        tf.setBorder(BorderFactory.createEmptyBorder());
        tf.setFont(new Font("Tohama", Font.BOLD, 14));
        P1.add(tf);


        jl2 = new JLabel("Name");
        jl2.setBounds(40, 60, 100, 25);
        jl2.setFont(new Font("Tohama", Font.BOLD, 14));
        P1.add(jl2);

        tf2 = new JTextField();
        tf2.setBounds(200, 60, 150,25 );
        tf2.setBorder(BorderFactory.createEmptyBorder());
        tf2.setFont(new Font("Tohama", Font.BOLD, 14));
        P1.add(tf2);


        jl3 = new JLabel("Security Question");
        jl3.setBounds(40, 100, 150, 25);
        jl3.setFont(new Font("Tohama", Font.BOLD, 14));
        P1.add(jl3);

        tf3 = new JTextField();
        tf3.setBounds(200, 100, 150,25 );
        tf3.setBorder(BorderFactory.createEmptyBorder());
        tf3.setFont(new Font("Tohama", Font.BOLD, 14));
        P1.add(tf3);




        jl4 = new JLabel("Answer");
        jl4.setBounds(40, 140, 100, 25);
        jl4.setFont(new Font("Tohama", Font.BOLD, 14));
        P1.add(jl4);

        tf4 = new JTextField();
        tf4.setBounds(200,140 , 150,25 );
        tf4.setBorder(BorderFactory.createEmptyBorder());
        tf4.setFont(new Font("Tohama", Font.BOLD, 14));
        P1.add(tf4);

        jl5 = new JLabel("Password");
        jl5.setBounds(40, 180, 100, 25);
        jl5.setFont(new Font("Tohama", Font.BOLD, 14));
        P1.add(jl5);

        tf5 = new JTextField();
        tf5.setBounds(200,180, 150,25 );
        tf5.setBorder(BorderFactory.createEmptyBorder());
        tf5.setFont(new Font("Tohama", Font.BOLD, 14));
        P1.add(tf5);



        jb = new JButton("Search");
        jb.setBounds(380, 20, 100, 25);
        jb.setBackground(Color.GRAY);
        jb.setForeground(Color.WHITE);
        jb.addActionListener(this);
        P1.add(jb);


        jb2 = new JButton("Retrieve");
        jb2.setBounds(380, 140, 100, 25);
        jb2.setBackground(Color.GRAY);
        jb2.setForeground(Color.WHITE);
        jb2.addActionListener(this);
        P1.add(jb2);

        jb3 = new JButton("Back");
        jb3.setBounds(150, 230, 100, 25);
        jb3.setBackground(Color.GRAY);
        jb3.setForeground(Color.WHITE);
        jb3.addActionListener(this);
        P1.add(jb3);








        setVisible(true);
    }




    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == jb) {

            try {
                String query = "select * from account where username = '"+tf.getText()+"'";
                Connect c = new Connect();

                ResultSet rs =  c.s.executeQuery(query);
                
                while(rs.next()){
                    tf2.setText(rs.getString("Name"));
                    tf3.setText(rs.getString("Security"));

                }
                
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } else if (e.getSource() == jb2) {

            try {
                String query = "select * from account where Answer  = '"+tf4.getText()+"' AND username = '"+tf.getText()+"'";
                Connect c = new Connect();

                ResultSet rs =  c.s.executeQuery(query);

                while(rs.next()){
                    tf5.setText(rs.getString("Password"));


                }

            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } else {
            setVisible(false);
            new LoginPage();

        }
    }


        public static void main(String[] args){

        ForgetPassword fp = new ForgetPassword();


    }

    }

