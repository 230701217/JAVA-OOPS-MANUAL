// Area of Circle = πr2 

// Circumference = 2πr

// Input:

// 2

// Output:

// Area = 12.57
// Circumference = 12.57



import java.io.*;
import java.util.Scanner;

class Circle
{
    private double radius;
    
    //Constructor to set radius 
    public Circle(double radius){
        // set the instance variable radius // 
        this.radius = radius;
    }
    
    //Method to set radius
    public void setRadius(double radius){
        // set the radius //
       this.radius = radius;
        
    }
    
    // Method to get the radius
    public double getRadius()    {
        // return the radius //
       return radius;
        
    }
    
    //Method to calculate the area of the circle
    public double calculateArea()  { // complete the below statement //
       return Math.PI * radius * radius;    // Calculate Area
        
    }
    
    //Method to calculate the circumference of the circle
    public double calculateCircumference()    { 
        // complete the statement //
       return  2 * Math.PI * radius;    // Calculate Circumference
    }
}
class prog{
    public static void main(String[] args)  {
        int r;
        Scanner sc= new Scanner(System.in);
        r=sc.nextInt();
        Circle c= new Circle(r);
        System.out.println("Area = "+String.format("%.2f", c.calculateArea()));
        // invoke the calculatecircumference method //
        System.out.println("Circumference = " + String.format("%.2f", c.calculateCircumference()));
        
        sc.close();
    }
}
