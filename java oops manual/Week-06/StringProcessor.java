// Example 1:

// Input 1: apple

// Input 2: orange

// Output: rponlgea

// Example 2:

// Input 1: fruits

// Input 2: are good

// Output: utsroigfeda

// Example 3:

// Input 1: ""

// Input 2: ""

// Output: null

//code
import java.util.*;

public class StringProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();

        String input2 = scanner.nextLine();

        String result = processStrings(input1, input2);
        System.out.println(result);

        scanner.close();
    }

    public static String processStrings(String input1, String input2) {
        String concatenated = input1 + input2;

        Set<Character> uniqueChars = new LinkedHashSet<>();
        for (char c : concatenated.toCharArray()) {
            if (c != ' ') {
                uniqueChars.add(c);
            }
        }

        List<Character> sortedChars = new ArrayList<>(uniqueChars);
        sortedChars.sort(Collections.reverseOrder());

        StringBuilder result = new StringBuilder();
        for (char c : sortedChars) {
            result.append(c);
        }

        return result.length() > 0 ? result.toString() : "null";
    }
}


