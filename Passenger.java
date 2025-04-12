public class Passenger {
    static int id=1;
    String name;
    int age;
    String berth;
    int passengerid;
    int seatpos ;
    String seatallo ;

    Passenger(String name , int age, String berth){
        this.name = name;
        this.age = age;
        this.berth = berth;
        passengerid=id++;
        seatpos=-1;
        seatallo="";
    }


}
