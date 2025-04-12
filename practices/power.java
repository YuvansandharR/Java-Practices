package practices;
class sum{
    static int func(int a,int b){
        int c=1;
        for(int i=0;i<b;i++){
            c=c*a; 
        }
        return c;
    }
}
public class power {
    public static void main(String[] args) {
        int result = sum.func(3,10 );
        System.out.println(result%10);
    }
}

//last digit of power