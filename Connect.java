import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connect {

    Connection c;
    Statement s;
    Connect(){

        //here we do the first step:-
        //1:- Register the driver in Jar file
        //2:- Creating connection
        //3:- Craeting statement //we made statement with the help of connection
        //4:- Executing the mysql queries





        try{
            c = DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem", "root", "mysql10");
            s = c.createStatement();

            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e){

            e.printStackTrace();
        }

    }
}
