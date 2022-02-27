package data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.ibatis.jdbc.ScriptRunner;

public class InitializeTables {
    public static void main(String[] args) {
        //Registering the Driver
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        
            //Getting the connection
            String mysqlUrl = "jdbc:mysql://localhost/5432";
            Connection con = DriverManager.getConnection(mysqlUrl, "postgres", "a");
            System.out.println("Connection established......");

            //Initialize the script runner
            ScriptRunner sr = new ScriptRunner(con);

            /*
            //Creating a reader object
            Reader reader;
            try {
                reader = new BufferedReader(new FileReader("Questions.sql"));
                //Running the script
                sr.runScript(reader);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }*/

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
