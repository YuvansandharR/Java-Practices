package practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class duplicate {
    public static void main(String[] args) {
        ArrayList<Integer> dup = new ArrayList<>();
        int brr[]={};
        int arr[]={1,2,2,3,6,2,3,4};
        Arrays.sort(arr);
        int n=arr.length-1;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]&&dup[i]){
                   brr=arr[i];
                }
            }
        }
        System.out.println(dup);
        System.out.println(n);
        
    }
    
}
