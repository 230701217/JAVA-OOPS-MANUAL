import java.util.Scanner;

public class SentenceReverser {

    public static String reverseSentence(String sentence, int caseOption) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();

            if (caseOption == 1) {
                for (int i = 0; i < word.length(); i++) {
                    char originalChar = word.charAt(i);
                    if (Character.isLetter(originalChar)) {
                        if (Character.isUpperCase(originalChar)) {
                            reversedWord.setCharAt(i, Character.toUpperCase(reversedWord.charAt(i)));
                        } else {
                            reversedWord.setCharAt(i, Character.toLowerCase(reversedWord.charAt(i)));
                        }
                    }
                }
            }

            result.append(reversedWord).append(" ");
        }

        // Remove the trailing space and return the result
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence
     
        String sentence = scanner.nextLine();

        // Input case option
        
        int caseOption = scanner.nextInt();

        // Validate case option
        if (caseOption != 0 && caseOption != 1) {
            System.out.println("Invalid case option! Enter 0 or 1.");
            return;
        }

        // Generate and display the modified sentence
        String modifiedSentence = reverseSentence(sentence, caseOption);
        System.out.println(modifiedSentence);

        scanner.close();
    }
}
