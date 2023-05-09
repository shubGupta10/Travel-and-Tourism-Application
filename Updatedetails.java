import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Updatedetails extends JFrame implements ActionListener {

    JComboBox comboid;

    JLabel labelname;
    JRadioButton male , female;
    JTextField tfnumber, tfcountry, tfaddress, tfemail, tfphone, tfid, tfgender;

    JLabel labelusername,jlid, jlusername;

    JButton Add, back;

    Updatedetails(String username){

        setBounds(300, 150, 850, 530);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);


        JLabel text = new JLabel("UPDATE CUSTOMER DETAILS");
        text.setBounds(50, 0 , 300, 25);
        text.setFont(new Font("Tohama", Font.PLAIN, 20));
        add(text);


        jlusername = new JLabel("Username");
        jlusername.setBounds(30, 50, 150, 25);
        add(jlusername);

        labelusername = new JLabel("");
        labelusername.setBounds(220, 50, 150, 25);
        add(labelusername);

        jlid = new JLabel("Id");
        jlid.setBounds(30, 90, 150, 25);
        add(jlid);

        tfid = new JTextField();
        tfid.setBounds(220, 90, 150, 25);
        add(tfid);



        JLabel numid = new JLabel("Number");
        numid.setBounds(30, 130, 150, 25);
        add(numid);



        //now we take input from user:-

        tfnumber = new JTextField();
        tfnumber.setBounds(220, 130, 150, 25);
        add(tfnumber);


        //now we need two label one for name and second label for storing name
        //we are taking label intead of textfield bcz we need an non editable thing

        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30, 170, 150, 25);
        add(lblname);

        labelname = new JLabel();
        labelname.setBounds(220, 170, 150, 25);
        add(labelname);


        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30, 210, 150, 25);
        add(lblgender);

        tfgender = new JTextField();
        tfgender.setBounds(220, 210, 150, 25);
        add(tfgender);

        JLabel lblcountry = new JLabel("Country");
        lblcountry.setBounds(30, 250, 150, 25);
        add(lblcountry);

        tfcountry = new JTextField();
        tfcountry.setBounds(220, 250, 150, 25);
        add(tfcountry);

        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(30, 290, 150, 25);
        add(lbladdress);

        tfaddress = new JTextField();
        tfaddress.setBounds(220, 290, 150, 25);
        add(tfaddress);

        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(30, 330, 150, 25);
        add(lblemail);

        tfemail = new JTextField();
        tfemail.setBounds(220, 330, 150, 25);
        add(tfemail);

        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(30, 370, 150, 25);
        add(lblphone);

        tfphone = new JTextField();
        tfphone.setBounds(220, 370, 150, 25);
        add(tfphone);

        Add = new JButton("Update");
        Add.setBackground(Color.BLACK);
        Add.setForeground(Color.WHITE);
        Add.addActionListener(this);
        Add.setBounds(70, 430, 100, 25);
        add(Add);

        back = new JButton("Back");
        back.setBounds(220, 430, 100, 25);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        add(back);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
        Image i2 = i1.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image4 = new JLabel(i3);
        image4.setBounds(400, 100, 450, 300);
        add(image4);

        try{

            Connect  c = new Connect();
            ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
            while(rs.next()){

                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));

                tfid.setText(rs.getString("Id"));
                tfnumber.setText(rs.getString("number"));
                tfgender.setText(rs.getString("gender"));
                tfcountry.setText(rs.getString("country"));
                tfaddress.setText(rs.getString("address"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }












        setVisible(true);




    }


    public void actionPerformed(ActionEvent e){

        if(e.getSource() == Add){

            String username = labelusername.getText();
            String Id = tfid.getText();
            String number = tfnumber.getText();
            String name = labelname.getText();
            String gender = tfgender.getText();


            String country = tfcountry.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();

            try{
                Connect c = new Connect();
                String query = "update customer set username = '"+username+"', Id =  '"+Id+"', number = '"+number+"',  name = '"+name+"' , gender = '"+gender+"', country = '"+country+"', address =  '"+address+"', phone =  '"+phone+"', email = '"+email+"'";
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Customer Details Updated Succesfully");

                setVisible(false);

            } catch (Exception e2 ){
                e2.printStackTrace();
            }


        } else {
            setVisible(false);
        }
    }



    public static void main(String[] args){


        new Updatedetails("shubham_10");
    }

}

