import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class viewBookedHotel extends JFrame implements ActionListener {

    String username;

    JButton back;

    viewBookedHotel(String username) {


        setBounds(400, 200, 1000, 600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel text = new JLabel("VIEW BOOKED HOTEL DETAILS");
        text.setBounds(200, 20, 400, 30);
        text.setFont(new Font("Tohama", Font.BOLD, 25));
        add(text);

        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(30, 70, 150, 25);
        add(usernameLabel);

        JLabel username2 = new JLabel();
        username2.setBounds(220, 70, 150, 25);
        add(username2);


        JLabel hotelnameLabel = new JLabel("Hotel Name");
        hotelnameLabel.setBounds(30, 110, 150, 25);
        add(hotelnameLabel);

        JLabel hotelnamelbl = new JLabel();
        hotelnamelbl.setBounds(220, 110, 150, 25);
        add(hotelnamelbl);


        JLabel personLabel = new JLabel("Total Persons");
        personLabel.setBounds(30, 150, 150, 25);
        add(personLabel);

        JLabel totalpersonlabel = new JLabel();
        totalpersonlabel.setBounds(220, 150, 150, 25);
        add(totalpersonlabel);


        JLabel daysLabel = new JLabel("Total Days");
        daysLabel.setBounds(30, 190, 150, 25);
        add(daysLabel);

        JLabel dayslbl = new JLabel();
        dayslbl.setBounds(220, 190, 150, 25);
        add(dayslbl);


        JLabel acNonACLabel = new JLabel("AC / Non-AC");
        acNonACLabel.setBounds(30, 230, 150, 25);
        add(acNonACLabel);

        JLabel acNonaclabel = new JLabel();
        acNonaclabel.setBounds(220, 230, 150, 25);
        add(acNonaclabel);



        JLabel foodlabel = new JLabel("Food Included");
        foodlabel.setBounds(30, 270, 150, 25);
        add(foodlabel);

        JLabel foodlbl = new JLabel();
        foodlbl.setBounds(220, 270, 150, 25);
        add(foodlbl);




        JLabel idLabel = new JLabel("Id");
        idLabel.setBounds(30, 310, 150, 25);
        add(idLabel);

        JLabel enterid = new JLabel();
        enterid.setBounds(220, 310, 150, 25);
        add(enterid);


        JLabel idnumLabel = new JLabel("Number");
        idnumLabel.setBounds(30, 350, 150, 25);
        add(idnumLabel);

        JLabel enterNumid = new JLabel();
        enterNumid.setBounds(220, 350, 150, 25);
        add(enterNumid);


        JLabel phoneLabel = new JLabel("Phone");
        phoneLabel.setBounds(30, 390, 150, 25);
        add(phoneLabel);

        JLabel enterphone = new JLabel();
        enterphone.setBounds(220, 390, 150, 25);
        add(enterphone);


        JLabel priceLabel = new JLabel("Total Cost");
        priceLabel.setBounds(30, 430, 150, 25);
        add(priceLabel);

        JLabel enterprice = new JLabel();
        enterprice.setBounds(220, 430, 150, 25);
        add(enterprice);



        back = new JButton("Back");
        back.setBounds(130, 500, 100, 25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);


        JLabel image = new JLabel(i3);
        image.setBounds(420, 80, 500, 400);
        add(image);


        try {
            Connect c = new Connect();
            String query = "select * from bookhotel where username = '" + username + "'";
            ResultSet rs = c.s.executeQuery(query);

            while (rs.next()) {
                username2.setText(rs.getString("username"));

                hotelnamelbl.setText(rs.getString("name"));
                totalpersonlabel.setText(rs.getString("persons"));
                enterid.setText(rs.getString("Id"));
                enterNumid.setText(rs.getString("number"));
                enterphone.setText(rs.getString("phone"));
                enterprice.setText(rs.getString("price"));
                foodlbl.setText(rs.getString("food"));
                acNonaclabel.setText(rs.getString("ac"));
                dayslbl.setText(rs.getString("days"));

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

        viewBookedHotel Vp = new viewBookedHotel("");
    }



}
