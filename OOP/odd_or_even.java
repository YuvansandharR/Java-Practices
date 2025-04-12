package OOP;
import java.util.Scanner;

class sum{
    int calc (int n){
    while(n>=2){
        n=n-2;
    }
        return n;
    }

}

public class odd_or_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sum a = new sum();
        System.out.println();
        if(a.calc(n)==0){
            System.out.println("It is even number" );
        }
        else{
            System.out.println("It is odd number");
        }
    }
    
}
