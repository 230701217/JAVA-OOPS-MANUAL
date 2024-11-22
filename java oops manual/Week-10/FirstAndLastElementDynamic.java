// Input: ArrayList = [1, 2, 3, 4] 
// Output: First = 1, Last = 4

// Input: ArrayList = [12, 23, 34, 45, 57, 67, 89] 
// Output: First = 12, Last = 89

//Code:
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLastElementDynamic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        System.out.println("ArrayList: " + list);
        printFirstAndLast(list);
    }

    // Method to print the first and last elements of an ArrayList
    public static void printFirstAndLast(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }
        int first = list.get(0); // Get the first element
        int last = list.get(list.size() - 1); // Get the last element
        System.out.println("First : " + first + ", Last : " + last);
    }
}
