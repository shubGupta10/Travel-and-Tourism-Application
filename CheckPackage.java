import javax.swing.*;
import java.awt.*;

public class CheckPackage  extends JFrame {

    CheckPackage() {

        setBounds(450, 200, 900, 600);
        // setLayout(null);


        //we can create tabs with the help of this tabbed class.
        JTabbedPane tab = new JTabbedPane();
        JPanel p1 = createPackage1();
        tab.addTab("Package 1", null, p1);

        JPanel p2 = createPackage2();
        tab.addTab("Package 2", null, p2);

        JPanel p3 = createPackage3();
        tab.addTab("Package 3", null, p3);

        add(tab);

        setVisible(true);
    }

    public JPanel createPackage1() {

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.white);


        JLabel l1 = new JLabel("~Bronze Package~");
        l1.setBounds(50, 5, 300, 30);
        l1.setForeground(Color.CYAN);
        l1.setFont(new Font("Tohama", Font.BOLD, 30));
        p1.add(l1);


        JLabel l2 = new JLabel("⭐6 Days and 7 Nights");
        l2.setBounds(30, 60, 300, 30);
        l2.setForeground(Color.RED);
        l2.setFont(new Font("Tohama", Font.BOLD, 20));
        p1.add(l2);


        JLabel l3 = new JLabel("⭐Airport Assitance");
        l3.setBounds(50, 110, 300, 30);
        l3.setForeground(Color.BLUE);
        l3.setFont(new Font("Tohama", Font.BOLD, 20));
        p1.add(l3);


        JLabel l4 = new JLabel("⭐Full Day City Tour");
        l4.setBounds(50, 160, 300, 30);
        l4.setForeground(Color.RED);
        l4.setFont(new Font("Tohama", Font.BOLD, 20));
        p1.add(l4);


        JLabel l5 = new JLabel("⭐Daily Buffet");
        l5.setBounds(50, 210, 300, 30);
        l5.setForeground(Color.BLUE);
        l5.setFont(new Font("Tohama", Font.BOLD, 20));
        p1.add(l5);


        JLabel l6 = new JLabel("⭐Drinks & Food on Arrival");
        l6.setBounds(50, 260, 300, 30);
        l6.setForeground(Color.RED);
        l6.setFont(new Font("Tohama", Font.BOLD, 20));
        p1.add(l6);


        JLabel l7 = new JLabel("⭐Full Day 3 island Cruise");
        l7.setBounds(50, 310, 300, 30);
        l7.setForeground(Color.BLUE);
        l7.setFont(new Font("Tohama", Font.BOLD, 20));
        p1.add(l7);


        JLabel l8 = new JLabel("⭐English & Hindi Speaking Guide");
        l8.setBounds(50, 360, 350, 30);
        l8.setForeground(Color.RED);
        l8.setFont(new Font("Tohama", Font.BOLD, 20));
        p1.add(l8);


        JLabel l9 = new JLabel("Book Now");
        l9.setBounds(60, 430, 300, 30);
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("Tohama", Font.BOLD, 25));
        p1.add(l9);


        JLabel l10 = new JLabel("Summer Special ");
        l10.setBounds(80, 480, 300, 30);
        l10.setForeground(Color.MAGENTA);
        l10.setFont(new Font("Tohama", Font.BOLD, 25));
        p1.add(l10);


        JLabel l11 = new JLabel("Rs 12000/-");
        l11.setBounds(500, 480, 300, 30);
        l11.setForeground(Color.CYAN);
        l11.setFont(new Font("Tohama", Font.BOLD, 25));
        p1.add(l11);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/package1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setBounds(350, 20, 500, 300);
        p1.add(image);

        return p1;
    }


    public JPanel createPackage2() {

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.white);


        JLabel l1 = new JLabel("~Silver Package~");
        l1.setBounds(50, 5, 300, 30);
        l1.setForeground(Color.CYAN);
        l1.setFont(new Font("Tohama", Font.BOLD, 30));
        p2.add(l1);


        JLabel l2 = new JLabel("⭐5 Days and 6 Nights");
        l2.setBounds(30, 60, 300, 30);
        l2.setForeground(Color.RED);
        l2.setFont(new Font("Tohama", Font.BOLD, 20));
        p2.add(l2);


        JLabel l3 = new JLabel("⭐Airport Assitance");
        l3.setBounds(50, 110, 300, 30);
        l3.setForeground(Color.BLUE);
        l3.setFont(new Font("Tohama", Font.BOLD, 20));
        p2.add(l3);


        JLabel l4 = new JLabel("⭐Full Day City Tour");
        l4.setBounds(50, 160, 300, 30);
        l4.setForeground(Color.RED);
        l4.setFont(new Font("Tohama", Font.BOLD, 20));
        p2.add(l4);


        JLabel l5 = new JLabel("⭐Tickets for Other Activity");
        l5.setBounds(50, 210, 300, 30);
        l5.setForeground(Color.BLUE);
        l5.setFont(new Font("Tohama", Font.BOLD, 20));
        p2.add(l5);


        JLabel l6 = new JLabel("⭐Safe Passage to Hotel");
        l6.setBounds(50, 260, 300, 30);
        l6.setForeground(Color.RED);
        l6.setFont(new Font("Tohama", Font.BOLD, 20));
        p2.add(l6);


        JLabel l7 = new JLabel("⭐Welcome Drinks on Arrival");
        l7.setBounds(50, 310, 300, 30);
        l7.setForeground(Color.BLUE);
        l7.setFont(new Font("Tohama", Font.BOLD, 20));
        p2.add(l7);


        JLabel l8 = new JLabel("⭐Dinner on Cruise");
        l8.setBounds(50, 360, 300, 30);
        l8.setForeground(Color.RED);
        l8.setFont(new Font("Tohama", Font.BOLD, 20));
        p2.add(l8);


        JLabel l9 = new JLabel("Book Now");
        l9.setBounds(60, 430, 300, 30);
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("Tohama", Font.BOLD, 25));
        p2.add(l9);


        JLabel l10 = new JLabel("Summer Special");
        l10.setBounds(80, 480, 300, 30);
        l10.setForeground(Color.MAGENTA);
        l10.setFont(new Font("Tohama", Font.BOLD, 25));
        p2.add(l10);


        JLabel l11 = new JLabel("Rs 24000/-");
        l11.setBounds(500, 480, 300, 30);
        l11.setForeground(Color.CYAN);
        l11.setFont(new Font("Tohama", Font.BOLD, 25));
        p2.add(l11);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/package2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setBounds(350, 20, 500, 300);
        p2.add(image);

        return p2;

    }


    public JPanel createPackage3(){


        JPanel p3 = new JPanel();
        p3.setLayout(null);
        p3.setBackground(Color.white);


        JLabel l1 = new JLabel("~Gold Package~");
        l1.setBounds(50, 5, 300, 30);
        l1.setForeground(Color.CYAN);
        l1.setFont(new Font("Tohama", Font.BOLD, 30));
        p3.add(l1);




        JLabel l2 = new JLabel("⭐6 Days and 5 Nights");
        l2.setBounds(30, 60, 300, 30);
        l2.setForeground(Color.RED);
        l2.setFont(new Font("Tohama", Font.BOLD, 20));
        p3.add(l2);




        JLabel l3 = new JLabel("⭐ Airport Assitance");
        l3.setBounds(50, 110, 300, 30);
        l3.setForeground(Color.BLUE);
        l3.setFont(new Font("Tohama", Font.BOLD, 20));
        p3.add(l3);



        JLabel l4 = new JLabel("⭐Free Clubing");
        l4.setBounds(50, 160, 300, 30);
        l4.setForeground(Color.RED);
        l4.setFont(new Font("Tohama", Font.BOLD, 20));
        p3.add(l4);




        JLabel l5 = new JLabel("⭐River Rafting");
        l5.setBounds(50, 210, 300, 30);
        l5.setForeground(Color.BLUE);
        l5.setFont(new Font("Tohama", Font.BOLD, 20));
        p3.add(l5);



        JLabel l6 = new JLabel("⭐Drinks Free");
        l6.setBounds(50, 260, 300, 30);
        l6.setForeground(Color.RED);
        l6.setFont(new Font("Tohama", Font.BOLD, 20));
        p3.add(l6);



        JLabel l7 = new JLabel("⭐Daily Buffet");
        l7.setBounds(50, 310, 300, 30);
        l7.setForeground(Color.BLUE);
        l7.setFont(new Font("Tohama", Font.BOLD, 20));
        p3.add(l7);



        JLabel l8 = new JLabel("⭐Dinner");
        l8.setBounds(50, 360, 300, 30);
        l8.setForeground(Color.RED);
        l8.setFont(new Font("Tohama", Font.BOLD, 20));
        p3.add(l8);



        JLabel l9 = new JLabel("Book Now");
        l9.setBounds(60, 430, 300, 30);
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("Tohama", Font.BOLD, 25));
        p3.add(l9);



        JLabel l10 = new JLabel("Winter Special");
        l10.setBounds(80, 480, 300, 30);
        l10.setForeground(Color.MAGENTA);
        l10.setFont(new Font("Tohama", Font.BOLD, 25));
        p3.add(l10);



        JLabel l11 = new JLabel("Rs 32000/-");
        l11.setBounds(500, 480, 300, 30);
        l11.setForeground(Color.CYAN);
        l11.setFont(new Font("Tohama", Font.BOLD, 25));
        p3.add(l11);



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/package3.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setBounds(350, 20, 500, 300);
        p3.add(image);

        return p3;
    }
        public static void main (String[]args){

            CheckPackage Cp = new CheckPackage();
        }
    }
