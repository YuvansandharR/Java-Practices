package OOP;

class Student{
    String name;
    int age;
    String address;
    Student(String fname, int Sage, String Saddress){
        this.name = fname;
        this.age = Sage;
        this.address = Saddress;
    }
    void changeName(String name){
        this.name = name;
    }
    // void Initialize(String name, int age, String addr){
    //     this.name = name;
    // }
    void PrintDetails(){
        System.out.println("Name: "+ this.name+ " Age "+this.age+ " adderess: "+this.address);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Name: "+ this.name+ " Age "+this.age+ " adderess: "+this.address;
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("yuvan", 20, "ewtyuj");
        Student s2 = new Student("naresh", 20, "lsirh");
        // System.out.println(s1.name);
        // s1.changeName("yuvansandhar");
        // System.out.println(s1.name);
        String str = new String("yuva");
        System.out.println(str);
        s1.PrintDetails();
        System.out.println(s1);
    }
}
