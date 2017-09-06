package classes;

import java.sql.*;

public class DBConnection {

    public Connection connection;

    public  void databaseConnection() {

        try{

            if(connection ==null || connection.isClosed()){

                String databaseDriver = "com.mysql.jdbc.Driver";
                String connectionURL = "jdbc:mysql://localhost:3306/dan_system";
                String databaseUsername = "root";
                String databasePassword = "";

                Class.forName(databaseDriver);
                connection = DriverManager.getConnection(connectionURL, databaseUsername, databasePassword);
            }
 }
        catch(Exception e){
                e.printStackTrace();

         }
     }
}
