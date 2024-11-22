//Input
// 5
// 1
// 2
// 3
// 100
// 5
//Output
// ArrayList: [1, 2, 3, 100, 5]
// Index of 100 = 1
// LastIndex of 100 = 3
// false
// Size Of ArrayList = 5
// ArrayList: [1, 500, 100, 100, 5]
//Code
import java.util.ArrayList;
import java.util.Scanner;

class prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

      
        ArrayList<Integer> list = new ArrayList<Integer>();

       
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("ArrayList: " + list);

        
        list.set(1, 100); // Replace the element at index 1 with 100

       
        System.out.println("Index of 100 = " + list.indexOf(100));

        // Getting the index of the last occurrence of 100
        System.out.println("LastIndex of 100 = " + list.lastIndexOf(100));

        // Check whether 200 is in the list or not
        System.out.println( list.contains(200)); 

        // Print ArrayList size
        System.out.println("Size Of ArrayList = " + list.size());

        // Inserting 500 at index 1
        list.add(1, 500); // Add 500 at index 1
        list.remove(3); // Remove the element at index 3


        System.out.print("ArrayList: " + list);
    }
}
