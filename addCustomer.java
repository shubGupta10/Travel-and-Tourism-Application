import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class addCustomer extends JFrame implements ActionListener {

    JComboBox comboid;

    JLabel labelname;
    JRadioButton male , female;
    JTextField tfnumber, tfcountry, tfaddress, tfemail, tfphone;

    JLabel labelusername,jlid, jlusername;

    JButton Add, back;

    addCustomer(String username){

        setBounds(450, 200, 850, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);


        jlusername = new JLabel("Username");
        jlusername.setBounds(30, 50, 150, 25);
        add(jlusername);

         labelusername = new JLabel("");
        labelusername.setBounds(220, 50, 150, 25);
        add(labelusername);

         jlid = new JLabel("Id");
        jlid.setBounds(30, 90, 150, 25);
        add(jlid);


        //we are using this combobox bcz it easy to use no need to add function like choice and
        //we also use this for drop down menu :-  to select things.
        comboid =  new JComboBox(new String[] { "Passport", "Aadhar Card", "Pan Card", "Ration Card"});
        comboid.setBounds(220, 90, 150, 25);
        comboid.setBackground(Color.white);
        add(comboid);



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

        male = new JRadioButton("Male");
        male.setBounds(220, 210, 70, 25);
        male.setBackground(Color.white);
        add(male);

        female = new JRadioButton("Female");
        female.setBackground(Color.white);
        female.setBounds(300, 210, 70, 25);
        add(female);


        //we have to group the button so fir dono me se ek select hoga
        //here buttongroup helps alot
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

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

        Add = new JButton("Add");
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


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image4 = new JLabel(i3);
        image4.setBounds(400, 40, 450, 420);
        add(image4);

        try{

            Connect  c = new Connect();
         ResultSet rs = c.s.executeQuery("select * from account where username = '"+username+"'");
         while(rs.next()){

             labelusername.setText(rs.getString("username"));
             labelname.setText(rs.getString("name"));
         }
        } catch (Exception e){
            e.printStackTrace();
        }












        setVisible(true);




    }


    public void actionPerformed(ActionEvent e){

        if(e.getSource() == Add){

            String username = labelusername.getText();
            String Id = (String) comboid.getSelectedItem();
            String number = tfnumber.getText();
            String name = labelname.getText();
            String gender = null;
            if(male.isSelected()){

                gender = "Male";

            } else {
                gender = "Female";
            }


            String country = tfcountry.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();

            try{
                Connect c = new Connect();
                String query = "insert into customer values('"+username+"', '"+Id+"', '"+number+"','"+name+"' , '"+gender+"', '"+country+"', '"+address+"', '"+phone+"', '"+email+"')";
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Customer Details Added Succesfully");

                setVisible(false);

            } catch (Exception e2 ){
                e2.printStackTrace();
            }


        } else {
            setVisible(false);
        }
    }



    public static void main(String[] args){


        addCustomer addCustomer1 = new addCustomer("");
    }

}
