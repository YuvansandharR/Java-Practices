package busreservation;

import java.util.Scanner;
import java.util.ArrayList;

public class busdemo {
    public static void main(String[] args) {

        ArrayList <bus> buses = new ArrayList<bus>();
        ArrayList<booking> bookings = new ArrayList<booking>();

        buses.add(new bus(1,true,2));
        buses.add(new bus(2, false, 50));
        buses.add(new bus(3, false, 45));

     int useroption = 1;
     Scanner sc = new Scanner(System.in);

     for(bus b:buses){
        b.displaybusinfo();
     }
     while(useroption==1){
        System.out.println("Enter 1 to booking and 2 to Exit");
        useroption = sc.nextInt();
       if(useroption==1){
        booking Booking = new booking();
        if(Booking.isAvailable(buses,bookings)){
            bookings.add(Booking);
            System.out.println("Your Booking is Confirmed");
        }
        else{
            System.out.println("Sorry , Bus is Full. Try another bus or Date");
        }
     }
     else{
        System.out.println("Thanks for coming !!");
     }
    }
}
}
