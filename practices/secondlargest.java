package practices;

public class secondlargest {
    public static void main(String[] args) {
        int arr[]={1,2,435,56,3,2};
        int max=0;
        int num=0;
        int a=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
       
        while(arr[a]<max){
            num=arr[a];
            a++;
        }
        if(arr[a]+1<max){
            a++;
            num =arr[a]+1;
            
        }
        System.out.println(num);
        System.out.println(max);
        
        
    }
}

/*Arrays.sort(arr); 
        int n = arr.length-1;
         int a = arr[n];
        for(int i=n;i>=0;i--){
            if(arr[i]!=a){
                return arr[i];
            }
    }
   
    return -1; */