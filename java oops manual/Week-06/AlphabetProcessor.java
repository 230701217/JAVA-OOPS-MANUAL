// Example 1:

// input1 = ww:ii:pp:rr:oo

// output = WIPRO

// Explanation:

// word1 is ww, both are same hence take w

// word2 is ii, both are same hence take i

// word3 is pp, both are same hence take p

// word4 is rr, both are same hence take r

// word5 is oo, both are same hence take o

// Hence the output is WIPRO

// Case 2:

// If the two alphabets are not same, then find the position value of them and find maximum value – minimum value.

// Take the alphabet which comes at this (maximum value - minimum value) position in the alphabet series.

// Example 2”

// input1 = zx:za:ee

// output = BYE

//Code
import java.util.Scanner;

public class AlphabetProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();

        String result = processInput(input1);
        System.out.println(result);
        scanner.close();
    }

    public static String processInput(String input1) {
        // Split the input string by ":"
        String[] wordPairs = input1.split(":");
        StringBuilder output = new StringBuilder();

        // Process each word pair
        for (String word : wordPairs) {
            char firstChar = word.charAt(0);
            char secondChar = word.charAt(1);

            if (firstChar == secondChar) {
                // Case 1: Both characters are the same
                output.append(Character.toUpperCase(firstChar));
            } else {
                // Case 2: Characters are different
                int position1 = firstChar - 'a' + 1; // Get position in alphabet
                int position2 = secondChar - 'a' + 1; // Get position in alphabet
                int maxMinDiff = Math.abs(position1 - position2); // Find max - min

                // Get the character at the maxMinDiff position in the alphabet
                char resultChar = (char) ('a' + maxMinDiff - 1);
                output.append(Character.toUpperCase(resultChar));
            }
        }

        // Return the final output as a string
        return output.toString();
    }
}
