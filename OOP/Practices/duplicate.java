import java.util.ArrayList;
import java.util.Scanner;

class duplicate{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        for (int i=0;i<n;i++){
            if(arr[i]==-1)continue;
            for(int j=i+1;j<n;j++){
            
                    if(arr[i]==arr[j]){
                        arr[j]=-1;
                           list.add(arr[i]);
                break;
                    }
                }
            }
           System.out.println(list);    
   }
}