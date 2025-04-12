package OOP;

class Hello{
    static int a = 10;
    static void hello(){
        System.out.println("hello");
    }
    static{
        int b = 30;
        int c = 20;
    }
}

public class Stat {
    void hi(){
        System.out.println("hi");
    }

    public static void main(String[] args) {
        
        System.out.println(Hello.a);
        
        Hello.hello();
        Stat s = new Stat();
        s.hi();
    }
}
