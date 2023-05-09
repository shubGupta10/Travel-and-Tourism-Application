import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class bookHotels extends JFrame implements ActionListener {


    Choice chotel, choiceAC, choiceFood;
    String username;
    JLabel labelusername, lblid, labelnumber, labelphone, labelprice, labelid;

    JButton checkprice, bookHotel, back;

    JTextField tfnoofdays, tfperson;

    bookHotels(String username){

        this.username = username;
        setBounds(200, 150, 1100, 600);
        setLayout(null);

        JLabel txt = new JLabel("Book Hotels");
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

        JLabel jlid = new JLabel("Select Hotel");
        jlid.setBounds(40, 110, 150, 20);
        jlid.setFont(new Font("Tohama", Font.PLAIN, 20));
        add(jlid);


        chotel = new Choice();
        chotel.setBounds(250,110, 200, 20 );
        add(chotel);

        try{
            Connect c = new Connect();
            ResultSet rs = c.s.executeQuery("select * from hotel");
            while(rs.next()){
                chotel.add(rs.getString("name"));
            }

        } catch(Exception e){
            e.printStackTrace();
        }


        JLabel lblperson = new JLabel("Total Person");
        lblperson.setBounds(40, 150, 150, 25);
        lblperson.setFont(new Font("Tohama", Font.PLAIN, 20));
        add(lblperson);


        tfperson = new JTextField();
        tfperson.setBounds(250, 150, 200, 25);
        add(tfperson);

        JLabel nofdays = new JLabel("No of Days:");
        nofdays.setBounds(40, 190, 150, 25);
        nofdays.setFont(new Font("Tohama", Font.PLAIN, 20));
        add(nofdays);


        tfnoofdays = new JTextField();
        tfnoofdays.setBounds(250, 190, 200, 25);
        add(tfnoofdays);



        JLabel acrooms = new JLabel("AC / Non-AC:");
        acrooms.setBounds(40, 230, 150, 25);
        acrooms.setFont(new Font("Tohama", Font.PLAIN, 20));
        add(acrooms);



        choiceAC = new Choice();
        choiceAC.add("AC");
        choiceAC.add("Non-AC");
        choiceAC.setBounds(250, 230, 200, 20);
        add(choiceAC);


        JLabel foodlbl = new JLabel("Food Included:");
        foodlbl.setBounds(40, 270, 150, 25);
        foodlbl.setFont(new Font("Tohama", Font.PLAIN, 20));
        add(foodlbl);



        choiceFood = new Choice();
        choiceFood.add("Yes");
        choiceFood.add("No");
        choiceFood.setBounds(250, 270, 200, 20);
        add(choiceFood);




        lblid = new JLabel("Id");
        lblid.setBounds(40, 310, 150, 20);
        lblid.setFont(new Font("Tohama", Font.PLAIN, 20));
        add(lblid) ;

        labelid = new JLabel();
        labelid.setBounds(250, 310, 200, 25);
        add(labelid);


        JLabel lblnumber = new JLabel("Number");
        lblnumber.setFont(new Font("Tohama", Font.PLAIN, 20));
        lblnumber.setBounds(40, 350, 150, 25);
        add(lblnumber);

        labelnumber = new JLabel();
        labelnumber.setBounds(250, 350, 150, 25);
        add(labelnumber);



        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(40, 390, 150, 20);
        lblphone.setFont(new Font("Tohama", Font.PLAIN, 20));
        add(lblphone);

        labelphone = new JLabel();
        labelphone.setBounds(250, 390, 200, 25);
        add(labelphone);


        JLabel lblprice = new JLabel("Total Price");
        lblprice.setFont(new Font("Tohama", Font.PLAIN, 20));
        lblprice.setBounds(40, 430, 150, 25);
        add(lblprice);

        labelprice = new JLabel();
        labelprice.setBounds(250, 430, 150, 25);
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
        checkprice.setBounds(60, 490, 120, 25);
        checkprice.setForeground(Color.white);
        checkprice.setBackground(Color.black);
        checkprice.addActionListener(this);
        add(checkprice);


        bookHotel = new JButton("Book Hotel");
        bookHotel.setBounds(200, 490, 120, 25);
        bookHotel.setForeground(Color.white);
        bookHotel.setBackground(Color.black);
        bookHotel.addActionListener(this);
        add(bookHotel);


        back = new JButton("Back");
        back.setBounds(340, 490, 120, 25);
        back.setBackground(Color.black);
        back.addActionListener(this);
        back.setForeground(Color.white);
        add(back);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setBounds(500, 50, 600, 400);
        add(image);






    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == checkprice){

            try {
                Connect c = new Connect();
                ResultSet rs = c.s.executeQuery("select * from hotel where name = '" + chotel.getSelectedItem() + "'");

                while(rs.next()){
                    int cost = Integer.parseInt(rs.getString("costperperson"));
                    int food = Integer.parseInt(rs.getString("foodincluded"));
                    int ac = Integer.parseInt(rs.getString("acroom"));

                    int persons = Integer.parseInt(tfperson.getText());
                    int days = Integer.parseInt(tfnoofdays.getText());

                    String acselected = choiceAC.getSelectedItem();
                    String foodselected = choiceFood.getSelectedItem();

                    if(persons * days > 0){
                        int total = 0;
                        total += acselected.equals("AC") ? ac : 0;
                        total += foodselected.equals("Yes") ? food : 0;


                        total += cost;
                        total = total * persons * days;
                        labelprice.setText("Rs " + total);

                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter a valid number");
                    }

                }
            } catch (Exception E){
                E.printStackTrace();
            }

        } else if (e.getSource() == bookHotel){

            try{

                Connect c = new Connect();
                c.s.executeUpdate("insert into bookhotel values('"+labelusername.getText()+"',  '"+chotel.getSelectedItem()+"', '"+tfperson.getText()+"' , '"+tfnoofdays.getText()+"', '"+choiceAC.getSelectedItem()+"' , '"+choiceFood.getSelectedItem()+"'  , '"+labelid.getText()+"' ,  '"+labelnumber.getText()+"',   '"+labelphone.getText()+"' ,  '"+labelprice.getText()+"')");

                JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
                setVisible(false);

            } catch (Exception E){
                E.printStackTrace();
            }
        } else{
            setVisible(false);
        }
    }

    public static void main(String[] args){

        bookHotels BH = new bookHotels("");
    }
}
