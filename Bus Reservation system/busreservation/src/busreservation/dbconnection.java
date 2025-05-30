package busreservation;

import java.sql.*;

public class dbconnection {
       private static final String url = "jdbc:mysql://localhost:3306/busreserv";
       private static final String username = "root";
       private static final String password = "Yuvan22@";
       
       public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url,username,password);
       }
    
}
