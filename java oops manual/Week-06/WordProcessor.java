// Example 1:

// input1 = "Today is a Nice Day"

// input2 = 41

// output = "iNce doTday"

// Example 2:

// input1 = "Fruits like Mango and Apple are common but Grapes are rare"

// input2 = 39

// output = "naMngo arGpes"

//Code:

import java.util.Scanner;

public class WordProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();

        int input2 = scanner.nextInt();

        String result = processWords(input1, input2);
        System.out.println(result);

        scanner.close();
    }

    public static String processWords(String input1, int input2) {
        // Split the input string into words
        String[] words = input1.split(" ");

        // Extract the digits from the input2 number
        int firstWordIndex = input2 / 10 - 1; // Get the first digit as index
        int secondWordIndex = input2 % 10 - 1; // Get the second digit as index

        // Process both words
        String processedFirstWord = processWord(words[firstWordIndex]);
        String processedSecondWord = processWord(words[secondWordIndex]);

        // Return the result with both processed words separated by a space
        return processedFirstWord + " " + processedSecondWord;
    }

    public static String processWord(String word) {
        int len = word.length();
        int mid = len / 2;

        // For words with odd lengths, include the middle character in both parts
        String middleToBegin;
        String middleToEnd;

        if (len % 2 == 0) {
            middleToBegin = new StringBuilder(word.substring(0, mid)).reverse().toString();
            middleToEnd = word.substring(mid);
        } else {
            middleToBegin = new StringBuilder(word.substring(0, mid + 1)).reverse().toString();
            middleToEnd = word.substring(mid);
        }

        // Merge and return the processed word
        return middleToBegin + middleToEnd;
    }
}

