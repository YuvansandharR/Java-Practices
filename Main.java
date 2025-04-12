import java.util.Scanner;
public class Main {
    public static void BookTicket(Passenger p){
        TicketBooking booker =new TicketBooking();
        if(TicketBooking.awl==0){
            System.out.println("No tickets available.......");
            return;
        }
        if(p.berth.equals("L") && TicketBooking.alb>0||
                p.berth.equals("M") && TicketBooking.amb>0 ||
                p.berth.equals("U") && TicketBooking.aub>0){
            System.out.println("Your slot is available...");
            if(p.berth.equals("L")){
                System.out.println("The lower berth given to ..."+p.name);
                booker.BookTicket(p,TicketBooking.LBpos.get(0),"L");
                TicketBooking.LBpos.remove(0);
                TicketBooking.alb--;
            }
            else if(p.berth.equals("U")){
                System.out.println("The Upper berth given to..."+p.name);
                booker.BookTicket(p,TicketBooking.UBpos.get(0),"U");
                TicketBooking.UBpos.remove(0);
                TicketBooking.aub--;
            }
            else if(p.berth.equals("M")){
                System.out.println("The Middle berth given to..."+p.name);
                booker.BookTicket(p,TicketBooking.MBpos.get(0),"M");
                TicketBooking.MBpos.remove(0);
                TicketBooking.amb--;
            }
        }
        else if(TicketBooking.alb>0){
            System.out.println("The lower berth given to..."+p.name);
            booker.BookTicket(p,TicketBooking.LBpos.get(0),"L");
            TicketBooking.LBpos.remove(0);
            TicketBooking.alb--;
        }
        else if(TicketBooking.amb>0){
            System.out.println("The Middle berth given to..."+p.name);
            booker.BookTicket(p,TicketBooking.MBpos.get(0),"M");
            TicketBooking.MBpos.remove(0);
            TicketBooking.amb--;
        }
        else if(TicketBooking.aub>0){
            System.out.println("The upper berth given to..."+p.name);
            booker.BookTicket(p,TicketBooking.UBpos.get(0),"U");
            TicketBooking.UBpos.remove(0);
            TicketBooking.aub--;
        }
        else if(TicketBooking.arac>0){
            System.out.println("RAC available for....."+p.name);
            booker.addRAC(p,TicketBooking.RACpos.get(0),"RAC");
            TicketBooking.RACpos.remove(0);
            TicketBooking.arac--;
        }
        else if(TicketBooking.awl>0){
            System.out.println(p.name+" is in Waiting list...");
            booker.addWL(p,TicketBooking.WLpos.get(0),"WL");
            TicketBooking.WLpos.remove(0);
            TicketBooking.awl--;
        }
    }


    public static void main(String[] args) {

        Scanner old=new Scanner(System.in);
         boolean loop = true;

         while(loop){
             System.out.println(" --------------------------------\n 1.Book ticket\n 2.cancel ticket\n 3.available tickets\n 4.passenger details\n 5.exit\n --------------------------------\n");
             int input= old.nextInt();
             switch (input){
                 case 1:{
                     System.out.println("------------Enter \nname , age , berth ...... ");
                     String name= old.next();
                     int age = old.nextInt();
                     String berth = old.next();

                     Passenger p =new Passenger(name, age , berth );
                     BookTicket(p);
                 }
                 break;
                 case 2:{
                     System.out.println("Enter passenger ID");
                     int id=old.nextInt();
                     TicketBooking booker =new TicketBooking();
                     booker.cancelticket(id);
                 }
                 case 3:{
                     TicketBooking booker =new TicketBooking();
                     booker.Availableberth();
                 }
                 break;
                 case 4:{
                     TicketBooking booker =new TicketBooking();
                     booker.passengerDetails();
                 }
                 break;
                 case 5:{
                     loop = false;
                 }
                 break;
                 default:
                     break;
             }
         }
    }
}