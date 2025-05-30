
interface animal {
    int mark = 20;
    void sound();
    
}
class cat implements animal{
    public void sound(){
        System.out.println("meoww");
    }
}
public class Interface {
    public static void main(String[] args) {
        cat c1= new cat();
        c1.sound();
        
        
    }
    
}
