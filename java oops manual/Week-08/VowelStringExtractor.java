// Example 1:

// input1: 3

// input2: {“oreo”, “sirish”, “apple”}

// output: oreoapple

// Example 2:

// input1: 2

// input2: {“Mango”, “banana”}

// output: no matches found

// Explanation:

// None of the strings has first and last character as vowel.
//Code

import java.util.Scanner;

public class VowelStringExtractor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int n = scanner.nextInt();
        scanner.nextLine();
       
        String[] strings = scanner.nextLine().split(" ");
       
        String result = extractVowelStrings(strings);
        System.out.println(result);
    }
   
    public static String extractVowelStrings(String[] strings) {
        StringBuilder concatenated = new StringBuilder();
       
        for (String str : strings) {
            if (str.length() > 0) {
                char firstChar = Character.toLowerCase(str.charAt(0));
                char lastChar = Character.toLowerCase(str.charAt(str.length() - 1));
               
                if (isVowel(firstChar) && isVowel(lastChar)) {
                    concatenated.append(str);
                }
            }
        }
       
        if (concatenated.length() > 0) {
            return concatenated.toString().toLowerCase();
        } else {
            return "no matches found";
        }
    }
   
    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
 

