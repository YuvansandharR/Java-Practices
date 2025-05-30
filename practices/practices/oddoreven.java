package practices;

import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        while(n>0){
            n=n-2;
        }
        if(n==0){
            System.out.println("it is even");
        }
        else{
            System.out.println("It is odd");
        }
    }
}
