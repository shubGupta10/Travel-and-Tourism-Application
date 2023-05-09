import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class bookPackage extends JFrame implements ActionListener {

    Choice cpackage;
    String username;
    JLabel labelusername, lblid, labelnumber, labelphone, labelprice, labelid;

    JButton checkprice, bookPackage, back;

    JTextField tfperson;

    bookPackage(String username){

        this.username = username;
        setBounds(350, 200, 1100, 500);
        setLayout(null);

        JLabel txt = new JLabel("Book Package");
        txt.setBounds(100, 10, 200, 30);
        txt.setFont(new Font("Tohama", Font.BOLD, 20));
        add(txt);


        JLabel jlusername = new JLabel("Username");
        jlusername.setBounds(40, 70, 100, 20);
        jlusername.setFont(new Font("Tohama", Font.PLAIN, 20));
        add(jlusername);

        labelusername = new JLabel("");
        labelusername.setBounds(250, 70, 200, 20);
        labelusername.setFont(new Font("Tohama", Font.PLAIN, 20));
        add(labelusername);

        JLabel jlid = new JLabel("Select Package");
        jlid.setBounds(40, 110, 150, 20);
        jlid.setFont(new Font("Tohama", Font.PLAIN, 20));
        add(jlid);


        cpackage = new Choice();
        cpackage.add("Gold Package");
        cpackage.add("Silver Package");
        cpackage.add("Bronze Package");
        cpackage.setBounds(250,110, 200, 20 );
        add(cpackage);


        JLabel numid = new JLabel("Total Person");
        numid.setBounds(40, 150, 150, 25);
        numid.setFont(new Font("Tohama", Font.PLAIN, 20));
        add(numid);


        tfperson = new JTextField();
        tfperson.setBounds(250, 150, 200, 25);
        add(tfperson);

        lblid = new JLabel("Id");
        lblid.setBounds(40, 190, 150, 20);
        lblid.setFont(new Font("Tohama", Font.PLAIN, 20));
        add(lblid) ;

        labelid = new JLabel();
        labelid.setBounds(250, 190, 200, 25);
        add(labelid);


        JLabel lblnumber = new JLabel("Number");
        lblnumber.setFont(new Font("Tohama", Font.PLAIN, 20));
        lblnumber.setBounds(40, 230, 150, 25);
        add(lblnumber);

        labelnumber = new JLabel();
        labelnumber.setBounds(250, 230, 150, 25);
        add(labelnumber);



        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(40, 270, 150, 20);
        lblphone.setFont(new Font("Tohama", Font.PLAIN, 20));
        add(lblphone);

        labelphone = new JLabel();
        labelphone.setBounds(250, 270, 200, 25);
        add(labelphone);


        JLabel lblprice = new JLabel("Total Price");
        lblprice.setFont(new Font("Tohama", Font.PLAIN, 20));
        lblprice.setBounds(40, 310, 150, 25);
        add(lblprice);

        labelprice = new JLabel();
        labelprice.setBounds(250, 310, 150, 25);
        add(labelprice);


        try{
            Connect c = new Connect();
            String query = "select * from customer where username = '"+username+"'";
            ResultSet rs = c.s.executeQuery(query);

            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("Id"));
                labelnumber.setText(rs.getString("number"));
                labelphone.setText(rs.getString("phone"));
            }



        } catch (Exception e){
            e.printStackTrace();
        }


        setVisible(true);


        checkprice = new JButton("Check Price");
        checkprice.setBounds(60, 380, 120, 25);
        checkprice.setForeground(Color.white);
        checkprice.setBackground(Color.black);
        checkprice.addActionListener(this);
        add(checkprice);


        bookPackage = new JButton("Book Package");
        bookPackage.setBounds(200, 380, 120, 25);
        bookPackage.setForeground(Color.white);
        bookPackage.setBackground(Color.black);
        bookPackage.addActionListener(this);
        add(bookPackage);


        back = new JButton("Back");
        back.setBounds(340, 380, 120, 25);
        back.setBackground(Color.black);
        back.addActionListener(this);
        back.setForeground(Color.white);
        add(back);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setBounds(550, 50, 500, 300);
        add(image);






    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == checkprice){

            String pack = cpackage.getSelectedItem();
            int cost = 0;
            if(pack.equals("Gold Package")){

                cost += 32000;

            } else if(pack.equals("Silver Package")){

                cost += 24000;


            } else {

                cost += 12000;
            }


            int persons = Integer.parseInt(tfperson.getText());
            cost *= persons;
            labelprice.setText("Rs " + cost);

        } else if (e.getSource() == bookPackage){

            try{

                Connect c = new Connect();
                c.s.executeUpdate("insert into bookpackage values('"+labelusername.getText()+"',  '"+cpackage.getSelectedItem()+"', '"+tfperson.getText()+"' , '"+labelid.getText()+"' ,  '"+labelnumber.getText()+"',   '"+labelphone.getText()+"' ,  '"+labelprice.getText()+"')");

                JOptionPane.showMessageDialog(null, "Package Booked Successfully");
                setVisible(false);

            } catch (Exception E){
                E.printStackTrace();
            }
        } else{
            setVisible(false);
        }
    }

    public static void main(String[] args){

        bookPackage Bp = new bookPackage("Tony_Stark");
    }


}
