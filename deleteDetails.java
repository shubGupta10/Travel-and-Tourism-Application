import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;





    public class deleteDetails  extends JFrame implements ActionListener {

        String username;
        JButton back;
        deleteDetails(String username){
            this.username = username;

            setBounds(450,180,870,625);
            getContentPane().setBackground(Color.WHITE);
            setLayout(null);

            JLabel usernameLabel = new JLabel("Username");
            usernameLabel.setBounds(30, 50, 150, 25);
            add(usernameLabel);

            JLabel username2 = new JLabel();
            username2.setBounds(220, 50, 150, 25);
            add(username2);


            JLabel idLabel = new JLabel("Id");
            idLabel.setBounds(30, 110, 150, 25);
            add(idLabel);

            JLabel id2 = new JLabel();
            id2.setBounds(220, 110, 150, 25);
            add(id2);



            JLabel numberLabel = new JLabel("Number");
            numberLabel.setBounds(30, 170, 150, 25);
            add(numberLabel);

            JLabel number3 = new JLabel();
            number3.setBounds(220, 170, 150, 25);
            add(number3);



            JLabel nameLabel = new JLabel("Name");
            nameLabel.setBounds(30, 230, 150, 25);
            add(nameLabel);

            JLabel name4 = new JLabel();
            name4.setBounds(220, 230, 150, 25);
            add(name4);



            JLabel genderLabel = new JLabel("Gender");
            genderLabel.setBounds(30, 290, 150, 25);
            add(genderLabel);

            JLabel gender5 = new JLabel();
            gender5.setBounds(220, 290, 150, 25);
            add(gender5);


            JLabel countryLabel = new JLabel("Country");
            countryLabel.setBounds(500, 50, 150, 25);
            add(countryLabel);

            JLabel country6 = new JLabel();
            country6.setBounds(690, 50, 150, 25);
            add(country6);



            JLabel addressLabel = new JLabel("Address");
            addressLabel.setBounds(500, 110, 150, 25);
            add(addressLabel);

            JLabel address7 = new JLabel();
            address7.setBounds(690, 110, 150, 25);
            add(address7);



            JLabel phoneLabel = new JLabel("Phone");
            phoneLabel.setBounds(500, 170, 150, 25);
            add(phoneLabel);

            JLabel phone8 = new JLabel();
            phone8.setBounds(690, 170, 150, 25);
            add(phone8);



            JLabel emailLabel = new JLabel("Email");
            emailLabel.setBounds(500, 230, 150, 25);
            add(emailLabel);

            JLabel email9 = new JLabel();
            email9.setBounds(690, 230, 150, 25);
            add(email9);

            back = new JButton("Delete");
            back.setBounds(350, 350, 100,25);
            back.setBackground(Color.BLACK);
            back.setForeground(Color.WHITE);
            back.addActionListener(this);
            add(back);



            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
            Image i2 = i1.getImage().getScaledInstance(600, 180, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);


            JLabel image = new JLabel(i3);
            image.setBounds(20, 400, 600, 200);
            add(image);


            //here we created a duplicate image by coping previous one

            ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
            Image i5 = i4.getImage().getScaledInstance(600, 180, Image.SCALE_DEFAULT);
            ImageIcon i6 = new ImageIcon(i5);


            JLabel image2 = new JLabel(i6);
            image2.setBounds(600, 400, 600, 200);
            add(image2);


            try{
                Connect c = new Connect();
                String query = "select * from customer where username = '"+username+"'";
                ResultSet rs = c.s.executeQuery(query);

                while(rs.next()){
                    username2.setText(rs.getString("username"));
                    id2.setText(rs.getString("Id"));
                    number3.setText(rs.getString("number"));
                    name4.setText(rs.getString("name"));
                    gender5.setText(rs.getString("gender"));
                    country6.setText(rs.getString("country"));
                    address7.setText(rs.getString("address"));
                    phone8.setText(rs.getString("phone"));
                    email9.setText(rs.getString("email"));
                }



            } catch (Exception e){
                e.printStackTrace();
            }


            setVisible(true);
        }



        @Override
        public void actionPerformed(ActionEvent e) {

            try{
                Connect c = new Connect();
                c.s.executeUpdate("delete from account where username = '"+username+"'");
                c.s.executeUpdate("delete from customer where username = '"+username+"'");
                c.s.executeUpdate("delete from bookpackage where username = '"+username+"'");
                c.s.executeUpdate("delete from bookhotel where username = '"+username+"'");


                JOptionPane.showMessageDialog(null, "Your Data Deleted Successfuly");

                setVisible(true);

            } catch(Exception E){
                E.printStackTrace();
            }

        }
        public static void main(String[] args){


            deleteDetails v1 = new deleteDetails("");

        }
        }



