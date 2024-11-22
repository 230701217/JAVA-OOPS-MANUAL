// Example 1:

// input1: {‘a’, ‘b’, ‘c’}

// input2: {‘b’, ’c’}

// output: 8

// Explanation:

// ‘b’ and ‘c’ are present in both the arrays.

// ASCII value of ‘b’ is 98 and ‘c’ is 99.

// 98 + 99 = 197

// 1 + 9 + 7 = 17

// 1 + 7 = 8
//Code:
import java.util.HashSet;
import java.util.Scanner;

public class CommonAlphabetsSum {

    public static int singleDigitSum(int sum) {
        while (sum > 9) {
            int digitSum = 0;
            while (sum > 0) {
                digitSum += sum % 10;
                sum /= 10;
            }
            sum = digitSum;
        }
        return sum;
    }

    public static int findCommonAlphabetsSum(char[] input1, char[] input2) {
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> commonSet = new HashSet<>();

       
        for (char c : input1) {
            set1.add(c);
        }

        
        for (char c : input2) {
            if (set1.contains(c)) {
                commonSet.add(c);
            }
        }

        
        int asciiSum = 0;
        for (char c : commonSet) {
            asciiSum += (int) c;
        }

       
        return singleDigitSum(asciiSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
               String[] input1Str = scanner.nextLine().split(" ");
            char[] input1 = new char[input1Str.length];
            for (int i = 0; i < input1Str.length; i++) {
                input1[i] = input1Str[i].charAt(0);
            }

            
            String[] input2Str = scanner.nextLine().split(" ");
            char[] input2 = new char[input2Str.length];
            for (int i = 0; i < input2Str.length; i++) {
                input2[i] = input2Str[i].charAt(0);
            }

            // Find the common alphabet sum
            int result = findCommonAlphabetsSum(input1, input2);

            // Output the result
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
