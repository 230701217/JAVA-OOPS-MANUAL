// Sample input and Output:
// Red
// Green
// Orange
// White
// Black
// Sample output
// List before reversing :                                                
// [Red, Green, Orange, White, Black]                                     
// List after reversing :                                                 
// [Black, White, Orange, Green, Red] 
//Code:
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();  
        ArrayList<String> colorList = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            String color = sc.nextLine();  
            colorList.add(color); 
        }
        System.out.println("List before reversing :");
        System.out.println(colorList);
        Collections.reverse(colorList);
        
        
        System.out.println("List after reversing :");
        System.out.println(colorList);
    }
}
