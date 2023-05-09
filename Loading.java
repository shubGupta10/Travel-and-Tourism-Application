import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable {

    Thread thread;
    JProgressBar bar;

    String username;

    Loading(String username){ //this username is comes from loginPage where user enter
                              // the username it take and show on loading page

        this.username = username;  //local se globally store.

        thread = new Thread(this);


        setBounds(500, 200, 650, 400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel text = new JLabel("Travel and Tourism Application");
        text.setBounds(50, 20, 600, 40);
        text.setForeground(Color.BLUE);
        text.setFont(new Font("Raleway", Font.BOLD, 30));
        add(text);


        //this progress bar is used for showing the progress bar in the frame:-
        bar = new JProgressBar();
        bar.setBounds(150, 100, 300, 35);

        //we have to use this function so we can get start it like 0%
        bar.setStringPainted(true);
        add(bar);


        JLabel wait = new JLabel("Loading , please wait..");
        wait.setBounds(200, 140, 180, 30);
        wait.setForeground(Color.blue);
        wait.setFont(new Font("Raleway", Font.BOLD, 16));
        add(wait);

        JLabel Welcome = new JLabel("Welcome "+ username);
        Welcome.setBounds(20, 310, 400,40);
        Welcome.setForeground(Color.RED);
        Welcome.setFont(new Font("Raleway", Font.BOLD, 16));
        add(Welcome);

        thread.start();

        setVisible(true);


    }

    public void run(){
        try{
            for(int i=1; i<=101; i++){
                int max = bar.getMaximum(); //this is the max 100 value

                int value = bar.getValue(); //with this function we take current value

                if(value < max){
                    bar.setValue(bar.getValue()+1);
                } else{
                    setVisible(false);
                    new DashBoard(username);
                }

                Thread.sleep(50);
            }


        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        Loading loading = new Loading("");


    }
}
