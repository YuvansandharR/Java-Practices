package OOP;

class Employee{
    private String name;
    private int salary;
    private String address;
    private int Account_no;
    private String  password;
    Employee(String name, int salary, String address, int Account_no, String password){
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.password = password;
    }

    String getName(String password){
        if(this.password.equals(password)){
            return this.name;
        }
        else{
            System.out.println("Invalid password");
        }
        return "";
    }

    void setName(String name){
        // int ispre = 0;
        // for(int i = 0; i < name.length(); i++){
        //     if(name.charAt(i) == '@'){
        //         ispre = 1;
        //         break;
        //     }
        // }
        // if(ispre == 1){
        //     this.name = name;
        //     System.out.println("username set");
        // }
        // else{
        //     System.out.println("Invalid user name");
        // }
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employee e = new Employee("Yuvan", 100000, "ksdgajk", 3178535, "3287hgjdsf");
        System.out.println(e.getName("euwihfh"));
       // e.setName("yuvansandhar@gmail.com");
        System.out.println(e.getName("3287hgjdsf"));
        e.setName("dhoni");
        System.out.println(e.getName("3287hgjdsf"));
    }
}
