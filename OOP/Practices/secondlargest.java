import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int largest = -1;
         int second = -1;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                second = largest; 
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i]; 
            }
        }
  System.out.println(second);
    }
    
}
