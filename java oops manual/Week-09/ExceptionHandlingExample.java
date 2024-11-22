// Input:

// 5

// 10  0 20 30 40 

// Output:

// java.lang.ArithmeticException: / by zero
// I am always executed
//Code
import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int size = scanner.nextInt();

            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

            int result = arr[0] / arr[1];
        
            System.out.println("Accessing out-of-bounds element: " + arr[3]);
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException: " + e.getMessage());

        } finally {
            System.out.println("I am always executed");
        }
    }
}
