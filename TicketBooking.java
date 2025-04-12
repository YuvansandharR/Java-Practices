import java.util.*;

public class TicketBooking {
    static int alb = 1;
    static int amb = 1;
    static int aub = 1;
    static int arac = 1;
    static int awl = 1;

    static Queue<Integer> queuerac = new LinkedList<>();
    static Queue<Integer> queuewl = new LinkedList<>();
    List<Integer> bookedpassenger =  new ArrayList<>();


    static List<Integer> LBpos = new ArrayList<>(Arrays.asList(1));
    static List<Integer> MBpos = new ArrayList<>(Arrays.asList(1));
    static List<Integer> UBpos = new ArrayList<>(Arrays.asList(1));
    static List<Integer> RACpos = new ArrayList<>(Arrays.asList(1));
    static List<Integer> WLpos = new ArrayList<>(Arrays.asList(1));

    static Map<Integer,Passenger> map = new HashMap<>();

    public void BookTicket(Passenger p , int position , String berthallo){

        p.seatpos = position;
        p.seatallo = berthallo;
        bookedpassenger.add(p.passengerid);
        map.put(p.passengerid,p);

        System.out.println("------------------booked Successfully");

    }
    public void addRAC(Passenger p , int position , String berth){
        p.seatpos=position;
        p.seatallo=berth;
        map.put(p.passengerid,p);
        queuerac.add(p.passengerid);
        System.out.println("Passenger added to RAC....");
    }
    public void addWL(Passenger p ,int position , String berth){
        p.seatpos=position;
        p.seatallo=berth;

        queuewl.add(p.passengerid);
        map.put(p.passengerid,p);
    }
    public void cancelticket(int passengerid){
        System.out.println("------------------------------ticket cancelled successfully....");
        Passenger p = map.get(passengerid);
        int passengerpos = p.seatpos;
        String passengerallo = p.seatallo;

        map.remove(Integer.valueOf(p.passengerid));
        bookedpassenger.remove(Integer.valueOf(p.passengerid));

        if(passengerallo.equals("L")){
            LBpos.add(passengerpos);
            alb++;
        }
        else if(passengerallo.equals("U")){
            UBpos.add(passengerpos);
            aub++;
        }
        else if(passengerallo.equals("M")){
            MBpos.add(passengerpos);
            amb++;
        }
        if(queuerac.size()>0){
            Passenger rac = map.get(queuerac.poll());
            int racpos = rac.seatpos;
            String racallo = rac.seatallo;
            map.remove(queuerac.poll());
            queuerac.remove(Integer.valueOf(rac.passengerid));
            arac++;
            RACpos.add(racpos);

            if(queuewl.size()>0){
                Passenger wl = map.get(queuewl.poll());
                int wlpos= wl.seatpos;
                String wlallo = wl.seatallo;
                map.remove(queuewl.poll());
                awl++;
                WLpos.add(wlpos);
                queuewl.remove(Integer.valueOf(wl.passengerid));

                wl.seatpos=RACpos.get(0);
                wl.seatallo="RAC";
                arac--;
                RACpos.remove(0);
                queuerac.add(wl.passengerid);
            }
            Main.BookTicket(rac);


        }
    }



    public void Availableberth(){
        System.out.println("---------------------------------");
        System.out.println("Available Lower berth : "+alb);
        System.out.println("Available upper berth : "+aub);
        System.out.println("Available Middle berth : "+amb);
        System.out.println("Available RAC berth : "+arac);
        System.out.println("Available Waiting list berth : "+awl);
        System.out.println("---------------------------------");
    }
    public void passengerDetails(){
        for(Passenger p : map.values()){
            System.out.println("Passenger ID : "+p.passengerid);
            System.out.println("Passenger Name : "+p.name);
            System.out.println("Passenger age : "+p.age);
            System.out.println("Passenger berth booked : "+p.seatallo);
            System.out.println("Passenger seat position : "+p.seatpos);
            System.out.println("-------------------------------------------");
        }
    }



}
