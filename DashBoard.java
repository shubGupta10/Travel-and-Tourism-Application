import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Callable;

public class DashBoard extends JFrame implements ActionListener {

    String username;

    JButton addpersonaldetail, viewpersonaldetails, Updatepersonaldetail, checkpackage, bookpackage, viewPackage, viewHotels;
    JButton destinations, bookhotels, viewbookhotels,Payments, Calculator, about, deletepersonaldetails;
    DashBoard(String username){
        this.username = username;

        setBounds(0, 0 , 1920, 1080);
        setLayout(null);
        setVisible(true);


        JPanel p1 = new JPanel();
        p1.setBounds(0, 0 , 1980, 100);
        p1.setBackground(new Color(0,0,102));
        p1.setLayout(null);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));

        //here we scale the image
        Image i2 = i1.getImage().getScaledInstance(127, 127, Image.SCALE_DEFAULT);

        ImageIcon i3 = new ImageIcon(i2);


        JLabel image = new JLabel(i3);
        image.setBounds(10, 0, 127, 127);
       // image.setBackground(Color.white);
        p1.add(image);


        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(130, 30, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tohama", Font.BOLD, 30));
        p1.add(heading);



        JPanel p2 = new JPanel();
        p2.setBounds(0, 65,300, 950 );
        p2.setBackground(new Color(0,0,102));
        p2.setLayout(null);
        add(p2);



        addpersonaldetail = new JButton("Add Personal Details");
        addpersonaldetail.setBounds(0,35,300,40);
        addpersonaldetail.setBackground(new Color(0,0 , 102));
        addpersonaldetail.setForeground(Color.WHITE);
        addpersonaldetail.setFont(new Font("Tohama", Font.PLAIN, 20));
        addpersonaldetail.setMargin(new Insets(0,0,0,30));
        addpersonaldetail.addActionListener(this);
        p2.add(addpersonaldetail);


        Updatepersonaldetail = new JButton("Update Personal Details");
        Updatepersonaldetail.setBounds(0,80,300,40);
        Updatepersonaldetail.setBackground(new Color(0,0 , 102));
        Updatepersonaldetail.setForeground(Color.WHITE);
        Updatepersonaldetail.setFont(new Font("Tohama", Font.PLAIN, 20));
        Updatepersonaldetail.setMargin(new Insets(0,0,0,30));
        Updatepersonaldetail.addActionListener(this);
        p2.add(Updatepersonaldetail);


        viewpersonaldetails = new JButton("View Personal Details");
        viewpersonaldetails.setBounds(0,120,300,40);
        viewpersonaldetails.setBackground(new Color(0,0 , 102));
        viewpersonaldetails.setForeground(Color.WHITE);
        viewpersonaldetails.setFont(new Font("Tohama", Font.PLAIN, 20));
        viewpersonaldetails.setMargin(new Insets(0,0,0,30));
        viewpersonaldetails.addActionListener(this);
        p2.add(viewpersonaldetails);

        deletepersonaldetails = new JButton("Delete Personal Details");
        deletepersonaldetails.setBounds(0, 160, 300, 40);
        deletepersonaldetails.setBackground(new Color(0,0,102));
        deletepersonaldetails.setForeground(Color.WHITE);
        deletepersonaldetails.setFont(new Font("Tohama", Font.PLAIN, 20));
        deletepersonaldetails.setMargin(new Insets(0,0,0, 30));
        deletepersonaldetails.addActionListener(this);
        p2.add(deletepersonaldetails);

        checkpackage = new JButton("Check Package");
        checkpackage.setBounds(0,200,300,40);
        checkpackage.setBackground(new Color(0,0 , 102));
        checkpackage.setForeground(Color.WHITE);
        checkpackage.setFont(new Font("Tohama", Font.PLAIN, 20));
        checkpackage.setMargin(new Insets(0,0,0,30));
        checkpackage.addActionListener(this);
        p2.add(checkpackage);

        bookpackage = new JButton("Book Package");
        bookpackage.setBounds(0,240,300,40);
        bookpackage.setBackground(new Color(0,0 , 102));
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setFont(new Font("Tohama", Font.PLAIN, 20));
        bookpackage.setMargin(new Insets(0,0,0,30));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);

        viewPackage = new JButton("View Package");
        viewPackage.setBounds(0,280,300,40);
        viewPackage.setBackground(new Color(0,0 , 102));
        viewPackage.setForeground(Color.WHITE);
        viewPackage.setFont(new Font("Tohama", Font.PLAIN, 20));
        viewPackage.setMargin(new Insets(0,0,0,30));
        viewPackage.addActionListener(this);
        p2.add(viewPackage);

        viewHotels = new JButton("View Hotels");
        viewHotels.setBounds(0,320,300,40);
        viewHotels.setBackground(new Color(0,0 , 102));
        viewHotels.setForeground(Color.WHITE);
        viewHotels.setFont(new Font("Tohama", Font.PLAIN, 20));
        viewHotels.setMargin(new Insets(0,0,0,30));
        viewHotels.addActionListener(this);
        p2.add(viewHotels);

        bookhotels = new JButton("Book Hotels");
        bookhotels.setBounds(0,360,300,40);
        bookhotels.setBackground(new Color(0,0 , 102));
        bookhotels.setForeground(Color.WHITE);
        bookhotels.setFont(new Font("Tohama", Font.PLAIN, 20));
        bookhotels.setMargin(new Insets(0,0,0,30));
        bookhotels.addActionListener(this);
        p2.add(bookhotels);


        viewbookhotels = new JButton("View Booked Hotels");
        viewbookhotels.setBounds(0,400,300,40);
        viewbookhotels.setBackground(new Color(0,0 , 102));
        viewbookhotels.setForeground(Color.WHITE);
        viewbookhotels.setFont(new Font("Tohama", Font.PLAIN, 20));
        viewbookhotels.setMargin(new Insets(0,0,0,30));
        viewbookhotels.addActionListener(this);
        p2.add(viewbookhotels);

        destinations = new JButton("Destinations");
        destinations.setBounds(0,440,300,40);
        destinations.setBackground(new Color(0,0 , 102));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tohama", Font.PLAIN, 20));
        destinations.setMargin(new Insets(0,0,0,30));
        destinations.addActionListener(this);
        p2.add(destinations);

        Payments = new JButton("Payments");
        Payments.setBounds(0,480,300,40);
        Payments.setBackground(new Color(0,0 , 102));
        Payments.setForeground(Color.WHITE);
        Payments.setFont(new Font("Tohama", Font.PLAIN, 20));
        Payments.setMargin(new Insets(0,0,0,30));
        Payments.addActionListener(this);
        p2.add(Payments);

        Calculator = new JButton("Calculator");
        Calculator.setBounds(0,520,300,40);
        Calculator.setBackground(new Color(0,0 , 102));
        Calculator.setForeground(Color.WHITE);
        Calculator.setFont(new Font("Tohama", Font.PLAIN, 20));
        Calculator.setMargin(new Insets(0,0,0,30));
        Calculator.addActionListener(this);
        p2.add(Calculator);

        //JButton Notepad = new JButton("Notepad");
        //Notepad.setBounds(0,650,300,50);
        //Notepad.setBackground(new Color(0,0 , 102));
        //Notepad.setForeground(Color.WHITE);
        //Notepad.setFont(new Font("Tohama", Font.PLAIN, 20));
        //Notepad.setMargin(new Insets(0,0,0,30));
        //p2.add(Notepad);

        about = new JButton("About");
        about.setBounds(0,560,300,40);
        about.setBackground(new Color(0,0 , 102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tohama", Font.PLAIN, 20));
        about.setMargin(new Insets(0,0,0,30));
        about.addActionListener(this);
        p2.add(about);


        ImageIcon i4 = new ImageIcon("icons/home.jpg");
        Image i5 = i4.getImage().getScaledInstance(1750, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);

        JLabel image2 = new JLabel(i6);
        image2.setBounds(0,0,1750, 1000);
        add(image2);

        JLabel headline = new JLabel("Travel and Tourism Management System");
        headline.setBounds(390, 160,1000,45);
        headline.setForeground(Color.red);
        headline.setFont(new Font("San SERIF", Font.BOLD, 45));
        image2.add(headline);


    }



    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == addpersonaldetail){

            new addCustomer(username);
        } else if( e.getSource() == viewpersonaldetails){
            new viewdetails(username);
        } else if (e.getSource() == Updatepersonaldetail){
            new Updatedetails(username);
        } else if(e.getSource() == checkpackage){
            new CheckPackage();
        } else if(e.getSource() == bookpackage){
            new bookPackage(username);
        } else if(e.getSource() == viewPackage){
            new viewPackage(username);
        } else if(e.getSource() == viewHotels){
            new viewHotels();
        } else if (e.getSource() == destinations){
            new Destinations();
        } else if (e.getSource() == bookhotels){
            new bookHotels(username);
        } else if (e.getSource() == viewbookhotels){
            new viewBookedHotel(username);
        } else if(e.getSource() == Payments){
            new Payment();
        } else if(e.getSource() == Calculator){
            try{

                //here we agre geting accees to the calculator by using this "RUNTIME" class
                Runtime.getRuntime().exec("calc.exe");
            } catch(Exception E){
                E.printStackTrace();
            }
        } else if(e.getSource() == about){
            new About();
        } else if (e.getSource() == deletepersonaldetails){
            new deleteDetails(username);
        }
    }
    public static void main(String[] args){

         new DashBoard("");
    }

}
