package busreservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class booking {
    String passengername;
    int busno;
    Date date;
    
    booking(){
         Scanner  sc =  new Scanner(System.in);
         System.out.println("Enter your Name ");
            this.passengername = sc.nextLine();
         System.out.println("Enter bus no :");
            this.busno = sc.nextInt();
         System.out.println("Enter your date of Journey(dd-mm-yyyy)");
            String dateinput = sc.next();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

            try {
                this.date = dateFormat.parse(dateinput);
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
    }
    public boolean isAvailable()throws Exception{
        busdao busda = new busdao();
        bookingdao bookingda = new bookingdao();

        int capacity = busda.getCapacity(busno);
        int booked = bookingda.getbookedcount(busno,date);
    
        return booked<capacity;
    }
}
