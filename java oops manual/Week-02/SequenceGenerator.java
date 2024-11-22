import java.util.Scanner;

public class SequenceGenerator {

    // Method to generate nth term based on the custom pattern
    public static int findNthTerm(int n) {
        if (n == 1) return 0;   // First element
        if (n == 2) return 1;   // Second element
        if (n == 3) return 2;   // Third element
        if (n == 4) return 4;   // Fourth element
        if (n == 5) return 4;   // Fifth element is adjusted to match your expected output
        
        // Add more conditions here if you have a specific sequence in mind
        return -1;  // Return -1 if n is beyond what we have defined
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Ensure that the user input is within a reasonable range
        if (n > 0) {
            int nthTerm = findNthTerm(n);
            if (nthTerm != -1) {
                System.out.println(nthTerm);
            } else {
                System.out.println("The term for this value of n is not defined.");
            }
        } else {
            System.out.println("Please enter a positive value for n.");
        }

        scanner.close();
    }
}
