package busreservation;
import java.sql.*;

public class busdao {
    public void displaybusinfo() throws SQLException{
            String query = "Select * from bus";
            Connection con = dbconnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                System.out.println("Bus no : "+rs.getInt(1));
                if(rs.getInt(2)==0)
                    System.out.println("AC : No");
                else
                    System.out.println("AC : Yes ");
                System.out.println("Capacity : "+ rs.getInt(3));
                
            }
            System.out.println("---------------------");
    }
    public int getCapacity(int id) throws Exception{
        String query = "Select capacity from bus where id ="+id;
        Connection con = dbconnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        return rs.getInt(1); 
    }
}
