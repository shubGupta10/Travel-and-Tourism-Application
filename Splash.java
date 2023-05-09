import javax.swing.*;
import java.awt.*;



public class Splash extends JFrame implements Runnable {


    Thread thread;

    Splash() {

        // setSize(1200, 600);
        //  setLocation(200, 100);


        //to add Images so we have to use image class, so make a object of image class

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));

        //this is image class to scale or fit  the image in frame
        Image i2 = i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);


        //now to place image on frame so we have to create a label and put it inside the label

        //you cant place image class object directly in jlabel so u have to
        //convert into imageIcon
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        add(image);

        //No we want transition in our images:-


        setVisible(true);



        //here we uses thread object to call run method by calling start method
        thread = new Thread(this);
        thread.start();

    }


    public void run() {

        try{
            Thread.sleep(6000);
            setVisible(false);
        } catch( Exception e){

        }

    }
    public static void main(String[] args){

        //we have to set the frame dynamically not hardcore


        Splash frame = new Splash();

            frame.setLocation(200, 100 );
            frame.setSize(1200, 600);
            try{
                Thread.sleep(10);

            } catch (Exception e){

            }

        }
    }


