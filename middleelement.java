import java.util.Scanner;
public class middleelement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();   
        }
        if(n%2==0){
            int x=arr[n/2];
            int y = arr[n/2-1];
            System.out.println(y);
            System.out.println(x);
        }
        else{
            n=n/2;
            System.out.println(arr[n]);
        }
       
    }
    
}
