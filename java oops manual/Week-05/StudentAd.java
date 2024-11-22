class College {
    protected String collegeName;

    // Constructor to initialize the college name
    public College(String collegeName) {
        this.collegeName = collegeName;
    }

    // Method to indicate a student has been admitted
    public void admitted() {
        System.out.println("A student admitted in " + collegeName);
    }
}

class Student extends College {
    String studentName;
    String department;

    // Constructor to initialize student details
    public Student(String collegeName, String studentName, String department) {
        super(collegeName); // Call the parent class constructor
        this.studentName = studentName;
        this.department = department;
    }

    // Override toString method to return student details
    @Override
    public String toString() {
        return "CollegeName : " + collegeName + "\n" +
               "StudentName : " + studentName + "\n" +
               "Department : " + department;
    }
}

public class StudentAd {
    public static void main(String[] args) {
        // Create an instance of Student
        Student s1 = new Student("REC", "Venkatesh", "CSE");
        
        // Invoke the admitted() method
        s1.admitted();
        
        // Print the details of the student
        System.out.println(s1.toString());
    }
}
