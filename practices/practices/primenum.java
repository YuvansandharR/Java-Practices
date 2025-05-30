package practices;
public class primenum {
public static void main(String[] args) {
    int n = 7;
    int c=0;
    if(n<=1){
        c++;
    }
    for(int i=2;i<=n/2;i++){
        if(n%2==0){
           c++;
        } 
        else{
            
        }
    }
if(c==0){
    System.out.println("it is prime number" );
}
else{
    System.out.println("It is not a prime");
}
}
    
}
