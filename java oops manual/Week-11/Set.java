// Sample Input and Output:
// 5
// 90
// 56
// 45
// 78
// 25
// 78
// Sample Output:
// 78 was found in the set.
// Sample Input and output:
// 3
// 2
// 7
// 9
// 5
// Sample Input and output:
// 5 was not found in the set.
//code
import java.util.HashSet;
import java.util.Scanner;

public class Set {
    public static void main(String[] args) {
        // Create a scanner object to read inputs
        Scanner sc = new Scanner(System.in);
        
        // Read the number of elements in the HashSet
        int n = sc.nextInt();
        
        // Create a HashSet to store the elements
        HashSet<Integer> set = new HashSet<>();
        
        // Read n elements and add them to the HashSet
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        
        // Read the element to be checked in the set
        int checkElement = sc.nextInt();
        
        // Check if the element is in the set
        if (set.contains(checkElement)) {
            System.out.println(checkElement + " was found in the set.");
        } else {
            System.out.println(checkElement + " was not found in the set.");
        }
        
        sc.close(); // Close the scanner
    }
}
