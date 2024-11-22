// 1. Final Variable:
// Once a variable is declared final, its value cannot be changed after it is initialized.
// It must be initialized when it is declared or in the constructor if it's not initialized at declaration.
// It can be used to define constants
//  final int MAX_SPEED = 120;  // Constant value, cannot be changed

// 2. Final Method:
// A method declared final cannot be overridden by subclasses.
// It is used to prevent modification of the method's behavior in derived classes.
// public final void display() {
//     System.out.println("This is a final method.");
// }

// 3. Final Class:
// A class declared as final cannot be subclassed (i.e., no other class can inherit from it).
// It is used to prevent a class from being extended and modified.
// public final class Vehicle {
//     // class code
// }

//Code:
class FinalExample {

    // Final variable
               final int maxSpeed = 120;

    // Final method
    public  final void displayMaxSpeed() {
           System.out.println("The maximum speed is: " + maxSpeed + " km/h");
    }
}

class SubClass extends FinalExample {

   // public void displayMaxSpeed() {
     //   System.out.println("Cannot override a final method");
  //  }

    // You can create new methods here
    public void showDetails() {
        System.out.println("This is a subclass of FinalExample.");
    }
}

class prog {
    public static void main(String[] args) {
        FinalExample obj = new FinalExample();
        obj.displayMaxSpeed();

        SubClass subObj = new SubClass();
        subObj.showDetails();
    }
}
