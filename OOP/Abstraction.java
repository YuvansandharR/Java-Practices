package OOP;

abstract class Atm{
    abstract void Withdraw(int amount);
    abstract void ShowBalance();
    abstract void changepin(int pin);
}

class AtmMachine extends Atm{
    int Total;
    int pin;
    AtmMachine(int total,int pin){
        this.Total = total;
        this.pin = pin;
    }
    void Withdraw(int amount){
        Total = Total - amount;
        System.out.println(Total);
    }

    void ShowBalance(){
        System.out.println(Total);
    }

    void changepin(int pin){
        this.pin = pin;
        System.out.println("pin changed");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Atm atm1 = new AtmMachine(20000, 13412);
        atm1.ShowBalance();
        atm1.Withdraw(1000);
        
        atm1.changepin(23432);
    }
}

