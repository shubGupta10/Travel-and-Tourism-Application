import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;


public class viewPackage extends JFrame implements ActionListener {
    String username;

    JButton back;

    viewPackage(String username) {


        setBounds(450, 200, 900, 450);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel text = new JLabel("View Package Details");
        text.setBounds(60, 0, 300, 30);
        text.setFont(new Font("Tohama", Font.BOLD, 25));

        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(30, 50, 150, 25);
        add(usernameLabel);

        JLabel username2 = new JLabel();
        username2.setBounds(220, 50, 150, 25);
        add(username2);


        JLabel packLabel = new JLabel("Package");
        packLabel.setBounds(30, 90, 150, 25);
        add(packLabel);

        JLabel packagelbl = new JLabel();
        packagelbl.setBounds(220, 90, 150, 25);
        add(packagelbl);


        JLabel personLabel = new JLabel("Persons");
        personLabel.setBounds(30, 130, 150, 25);
        add(personLabel);

        JLabel enterlabel = new JLabel();
        enterlabel.setBounds(220, 130, 150, 25);
        add(enterlabel);


        JLabel idLabel = new JLabel("Id");
        idLabel.setBounds(30, 170, 150, 25);
        add(idLabel);

        JLabel enterid = new JLabel();
        enterid.setBounds(220, 170, 150, 25);
        add(enterid);


        JLabel idnumLabel = new JLabel("Number");
        idnumLabel.setBounds(30, 210, 150, 25);
        add(idnumLabel);

        JLabel enterNumid = new JLabel();
        enterNumid.setBounds(220, 210, 150, 25);
        add(enterNumid);


        JLabel phoneLabel = new JLabel("Phone");
        phoneLabel.setBounds(30, 250, 150, 25);
        add(phoneLabel);

        JLabel enterphone = new JLabel();
        enterphone.setBounds(220, 250, 150, 25);
        add(enterphone);


        JLabel priceLabel = new JLabel("Price");
        priceLabel.setBounds(30, 290, 150, 25);
        add(priceLabel);

        JLabel enterprice = new JLabel();
        enterprice.setBounds(220, 290, 150, 25);
        add(enterprice);



        back = new JButton("Back");
        back.setBounds(130, 360, 100, 25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);


        JLabel image = new JLabel(i3);
        image.setBounds(420, 20, 500, 400);
        add(image);


        try {
            Connect c = new Connect();
            String query = "select * from bookpackage where username = '" + username + "'";
            ResultSet rs = c.s.executeQuery(query);

            while (rs.next()) {
                username2.setText(rs.getString("username"));
                packagelbl.setText(rs.getString("package"));
                enterlabel.setText(rs.getString("persons"));
                enterid.setText(rs.getString("Id"));
                enterNumid.setText(rs.getString("number"));
                enterphone.setText(rs.getString("phone"));
                enterprice.setText(rs.getString("price"));

            }


        } catch (Exception e) {
            e.printStackTrace();

        }

        setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == back){
            setVisible(false);
        }
    }



    public static void main(String[] args) {

        viewPackage Vp = new viewPackage("");
    }

}