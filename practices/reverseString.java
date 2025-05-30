import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b="";
        char c;
        for (int i=0;i<a.length();i++){
            c=a.charAt(i);
            b=c+b;
        }
        System.out.println(b);
    }
    
}
