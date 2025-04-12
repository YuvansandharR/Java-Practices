package OOP;

class Animals{
    void voice(){
        System.out.println("suuuuuu");
    }
}

class Cat extends Animals{
    void voice(){
        System.out.println("meow");
    }
}

public class RunTime {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.voice();
        
        Animals a = new Animals();
        a.voice();

    
        Animals animals = new Cat();
        animals.voice();
    }
}
