// Sample Input and Output:
// 5
// Football
// Hockey
// Cricket
// Volleyball
// Basketball
// 7 // HashSet 2:
// Golf
// Cricket
// Badminton
// Football
// Hockey
// Volleyball
// Handball
// SAMPLE OUTPUT:
// Football
// Hockey
// Cricket
// Volleyball
// Basketball
//Code:
import java.util.HashSet;
import java.util.Scanner;

public class Gameshash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        sc.nextLine();  
        HashSet<String> set1 = new HashSet<>();
        
        // Read elements for the first set
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextLine());
        }
        
        int n2 = sc.nextInt();
        sc.nextLine();  

        // Create the second HashSet (Set 2)
        HashSet<String> set2 = new HashSet<>();
        
        // Read elements for the second set
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextLine());
        }

        // Retain common elements between set1 and set2
        set1.retainAll(set2);

        // Print the common elements
        for (String element : set1) {
            System.out.println(element);
        }
        
        sc.close();  // Close the scanner
    }
}
