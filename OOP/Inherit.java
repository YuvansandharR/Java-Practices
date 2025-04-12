package OOP;

class Vehicle{
    String Name;
    String Engine_type;
    int Vehicle_number;
    int No_of_wheels;
    Vehicle(){
        super();
        System.out.println("hello");
    }
}

class Bike extends Vehicle{
    int Mileage;
    Bike(){
        System.out.println("Bike");
    }
    Bike(String Name, String Engine_type, int Vehicle_number, int No_of_wheels, int Mileage){
        
        this.Name = Name;
        this.Engine_type = Engine_type;
        this.Vehicle_number = Vehicle_number;
        this.No_of_wheels = No_of_wheels;
        this.Mileage = Mileage;
    }
    void PrintDetails(){
        System.out.println(Name+" "+Engine_type+" "+Vehicle_number+" "+No_of_wheels+" "+Mileage);
    } 
}
class Car extends Bike{
    String Silencer_type;
    Car(String Name, String Engine_type, int Vehicle_number, int No_of_wheels, int Mileage, String Silencer_type){
        super(Name, Engine_type, Vehicle_number, No_of_wheels, Mileage);
        this.Silencer_type = Silencer_type;
    }  
    void PrintDetails(){
        System.out.println(Name+" "+Engine_type+" "+Vehicle_number+" "+No_of_wheels+" "+Mileage+ " "+Silencer_type);
    } 
}

public class Inherit {
    public static void main(String[] args) {
        Bike b = new Bike("pulzar", "petrol", 1233, 2, 50);
        Car c = new Car("Thar", "petrol", 2132, 4, 15, "Turbo");
        Car C1 = new Car("Audi", "EV", 3442, 2, 8, "turbo");
        b.PrintDetails();
        c.PrintDetails();
        C1.PrintDetails();


        //Parent Reference Child Class

        
    }
}
