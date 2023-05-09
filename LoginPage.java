import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class LoginPage extends JFrame implements ActionListener {

    JButton jb, jb2, jb3;

    JFrame jframe;

    JTextField tf, tf2;


    public LoginPage(){

        setSize(900, 500);
        setLocation(350, 200);
        setVisible(true);
        //here we will be using custom layout  so layout is null
        setLayout(null);

        getContentPane().setBackground(Color.WHITE);

        JPanel p1 = new JPanel();
        p1.setBounds(0, 0, 400, 500);
        p1.setBackground(new Color(131, 193 , 233));
        //we have to set this null so the image.bound can run
        p1.setLayout(null);
        add(p1);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));

        //here we scale the image or you can say we fit perfectly in frame:-
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);

        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setBounds(100, 120, 200, 200);
        p1.add(image);




        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(410, 30, 450, 350);
        add(p2);


        JLabel jl= new JLabel("Username");
        jl.setBounds(60, 30, 100, 30);
        jl.setFont(new Font("San SERIF", Font.PLAIN, 20));
        p2.add(jl);

         tf = new JTextField("");
        tf.setBounds(60, 70, 300, 30);
       // tf.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tf);

        JLabel jl2 = new JLabel("Password");
        jl2.setBounds(60, 110, 100, 30 );
        jl2.setFont(new Font("San SERIF", Font.PLAIN, 20 ));
        p2.add(jl2);



        tf2 = new JTextField("");
        tf2.setBounds(60, 150, 300, 30 );
        //tf2.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tf2);



        jb = new JButton("Login");
        jb.setBounds(60, 220, 100, 30 );
        jb.setBackground(new Color(133, 193, 233));
        //jb.setBorder(new LineBorder(new Color(133, 193, 233)));
        jb.setForeground(Color.BLACK);
        jb.addActionListener(this);

       // jb.setForeground(new Color(133, 193, 233));
        p2.add(jb);

        jb2 = new JButton("Signup");
        jb2.setBounds(180, 220, 100, 30);
        jb2.setBackground(new Color(133, 193, 233));
        jb.setForeground(Color.BLACK);
        jb2.addActionListener(this);
        p2.add(jb2);

        jb3 = new JButton("Forget Password");
        jb3.setBounds(100, 280, 140, 30 );
        jb3.setBackground(new Color(133, 193, 233));
        jb3.setForeground(Color.BLACK);
        jb3.addActionListener(this);
        p2.add(jb3);


        JLabel troubleLogin = new JLabel("Trouble in Login...");
        troubleLogin.setBounds(270, 300, 150, 30);
        troubleLogin.setForeground(Color.RED);
        p2.add(troubleLogin);







        setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == jb){

            try{
                String username = tf.getText();
                String password = tf2.getText();

                String query = "select * from account where username = '"+username+"' AND password = '"+password+"'";

                Connect c = new Connect();
                ResultSet rs = c.s.executeQuery(query); //here we uses resultSet to store the query

                if(rs.next()){ //here next function only provide true or false
                    setVisible(false);
                    new Loading(username);
                } else {

                    JOptionPane.showMessageDialog(null, "Your Password and Username is incorrect");
                }
            } catch (Exception E){
                E.printStackTrace();
            }
        } else if (e.getSource() == jb2){

            setVisible(false);
            new SignUp();

        } else{

            setVisible(false);
            new ForgetPassword();
        }
    }

    public static void main(String[] args){

        LoginPage Lp = new LoginPage();



    }

}
