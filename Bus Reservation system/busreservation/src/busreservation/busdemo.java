package busreservation;

import java.util.Scanner;
import java.util.ArrayList;

public class busdemo {
    public static void main(String[] args) throws Exception {

        busdao busda = new busdao();
        busda.displaybusinfo();

     int useroption = 1;
     Scanner sc = new Scanner(System.in);

     while(useroption==1){
        System.out.println("Enter 1 to booking and 2 to Exit");
        useroption = sc.nextInt();
       if(useroption==1){
        booking Booking = new booking();
        if(Booking.isAvailable()){
           bookingdao bookingda = new bookingdao();
           bookingda.addBooking(Booking);
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
    sc.close();  
}
}
