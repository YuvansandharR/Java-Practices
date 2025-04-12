package OOP;


//Method overloading(compile time Polymorphism)
class Add{
    void add(int a, int b){
        System.out.println(a+b);
    }

    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}

class Animal{
    void sound(){
        System.out.println("Normal sound");
    }

    void sound(String name){
        System.out.println(name);
    }
}

public class Polymorph {
    public static void main(String[] args) {
        Animal v = new Animal();
        v.sound();
        v.sound("eweewd");
        Add a = new Add();
        a.add(0, 0);
    }
}
