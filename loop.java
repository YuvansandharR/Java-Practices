import java.util.ArrayList;
import java.util.Scanner;

public class loop{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 1;
        ArrayList<Integer> arr = new ArrayList<>();
        if(n == 0 || n == 1){
            System.out.println(0);
        }
        else if(n == 3){
            System.out.println(1);
        }
        else{
            arr.add(a);
            arr.add(b);
            arr.add(c);
            int sum = 0;
            for(int i = 4; i <= n+1; i++){
                sum = a + b + c;
                arr.add(sum);
                a = b;
                b = c;
                c = sum;
            }
          //  System.out.println(arr);
            System.out.println(sum);
        }
    }
}
