// This is as mentioned below:

// Z : 0

// Y : 00

// X : 000

// W : 0000

// V : 00000

// U : 000000

// T : 0000000

// and so on upto A having 26 0’s (00000000000000000000000000).

// The sequence of 0’s in the encoded form are separated by a single 1 which helps to distinguish between 2 letters.

// Example 1:

// input1: 010010001

// The decoded string (original word) will be: ZYX

// Example 2:

// input1: 00001000000000000000000100000000000100000000010000000000001
//o/p:Wipro
import java.util.Scanner;

public class Decoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the input string
        String input = sc.nextLine().trim();

        // Decode the input string
        String decodedWord = decode(input);

        // Print the decoded word
        System.out.println(decodedWord);

        sc.close();
    }

    public static String decode(String encoded) {
        StringBuilder decodedWord = new StringBuilder();
        
        // Split the input by '1' to isolate the sequences of '0's
        String[] zeroSequences = encoded.split("1");
        
        // Loop through each zero sequence
        for (String seq : zeroSequences) {
            if (!seq.isEmpty()) {
                // The length of the sequence of '0's determines the character
                // For example, a sequence of 1 zero ('0') corresponds to 'Z'
                int letterIndex = seq.length(); // Number of '0's
                char decodedChar = (char) ('Z' - (letterIndex - 1)); // Calculate corresponding letter
                decodedWord.append(decodedChar);
            }
        }
        
        return decodedWord.toString();
    }
}
