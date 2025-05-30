package practices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class jdbcinsert {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String username = "root";
        String password = "Yuvan22@";
        String query = "select * from employee";

        Connection con = DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
      
        while (rs.next()) {
        System.out.println(rs.getInt(1));
        System.out.println(rs.getString(2));
        System.out.println(rs.getInt(3));
        }
        con.close();
    }
}