package OOP;

class Single{
    String a = "Hello";
    private Single(){

    }
    static Single Instance = null;
    static Single getInstance(){
        if(Instance == null){
            Instance = new Single();
        }
        return Instance;
    }
}

public class Singleton {
    public static void main(String[] args) {
        Single s = Single.getInstance();
        Single s1 = Single.getInstance();
        Single s3 = Single.getInstance();

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s3);
    }
}
