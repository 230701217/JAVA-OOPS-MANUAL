// Output:

// No-arg constructor is invoked
// 1 arg constructor is invoked
// 2 arg constructor is invoked
// Name =null , Roll no = 0
// Name =Rajalakshmi , Roll no = 0
// Name =Lakshmi , Roll no = 101
//Code.
import java.util.Scanner;

class Student {
    private String name;
    private int roll;
    public Student() {
        this.name = null;
        this.roll = 0;
        System.out.println("No-arg constructor is invoked");
    }
    
    public Student(String n) {
        this.name = n;
        this.roll = 0;
        System.out.println("1 arg constructor is invoked");
    }
    
    public Student(String n, int r) {
        this.name = n;
        this.roll = r;
        System.out.println("2 arg constructor is invoked");
    }
    
    public void display() {
        System.out.println("Name =" + this.name + " , Roll no = " + this.roll);
    }
}

public class Stud {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("Rajalakshmi");
        Student s3 = new Student("Lakshmi", 101);
        
        s1.display();
        s2.display();
        s3.display();
    }
}
