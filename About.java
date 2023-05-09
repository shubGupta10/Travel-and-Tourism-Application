import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame implements ActionListener {

    About() {

        setBounds(600, 200, 500, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);


        JLabel label1 = new JLabel("About");
        label1.setBounds(200, 10, 100, 40);
        label1.setBackground(Color.RED);
        label1.setForeground(Color.RED);
        label1.setFont(new Font("Tohama", Font.PLAIN, 30));
        add(label1);

        String s;


        s = "About Project              \n " +

        "\n" +

        "\n"+

          "The main objectivbe of the Travel and Tourism Management System project is to develop a system that automates the processes and activity of a travel and the purpose as to design a system which can perform all the operation related to travelling \n"+

                "\n"+
                "\n"+

          "This application will help in accessing the information related to the tarvel to the particular destination with great ease. The users can track the information related to their tour easily thrugh the application. \n"+

                "\n"+
                "\n"+

          "Advantages of the project\n"+
                "1:- Gives Accurate Information\n"+
                "2:- Simplifies the manual work\n"+
                "3:- It reduces the documentation work\n"+
                "4:- Friendly environment by providing warning messages\n"+
                "5:- It provides easiness to the users \n"+
                "6:- A normal users can also use this app easily\n";


        //here we are using awt textarea bcz we need it:-
        TextArea area = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        area.setBounds(20, 100, 450, 300);
        area.setBackground(Color.WHITE);
        area.setForeground(Color.BLACK);
        area.setEditable(false);
        add(area);


        setVisible(true);


    }

    public static void main(String[] args){
        new About();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
