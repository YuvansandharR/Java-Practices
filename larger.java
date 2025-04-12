
public class larger {
    static int sum(int []arr){
        int max = arr[0];
        for(int i =1;i <arr.length;i++){
            if(arr[i]<max){
            max = arr[i];
            
            }
        }return max;
    }
    public static void main(String[] args) {
        int arr[] = {21,32,54,34,23,4,} ;
        System.out.println(sum(arr));
        if(sum(arr)%2==0){
            System.out.println("It is even");
        }
        else{
            System.out.println("It is odd");
        }
    }
    
}
