package busreservation;
import java.sql.*;
import java.util.Date;

public class bookingdao {
    public int getbookedcount(int busno, Date date)throws Exception{
      
        String query = "select count(passenger_name) from bookings where bus_no=? and travel_date =?";
        Connection con = dbconnection.getConnection();
        PreparedStatement pst = con.prepareStatement(query);
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        pst.setInt(1, busno);
        pst.setDate(2, sqlDate);
        ResultSet rs = pst.executeQuery();
        rs.next();
        return rs.getInt(1);
    }
    public void addBooking(booking Booking) throws Exception{
        String query = "INSERT INTO bookings (passenger_name, bus_no, travel_date) VALUES (?, ?, ?)";
        Connection con = dbconnection.getConnection();
         con.setAutoCommit(false);
         java.sql.Date sqlDate = new java.sql.Date(Booking.date.getTime());
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, Booking.passengername);
        pst.setInt(2, Booking.busno);
        pst.setDate(3, sqlDate);

        pst.executeUpdate();
        con.commit();

         pst.close();
        con.close();
    }
}
