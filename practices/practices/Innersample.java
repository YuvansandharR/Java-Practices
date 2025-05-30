package practices;

abstract class sample {
    abstract void run();
}
    public class Innersample extends sample{
    void run(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
       Innersample oj = new Innersample();
       oj.run();
       }
    }
