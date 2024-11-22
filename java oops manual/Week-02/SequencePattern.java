// Consider the following sequence:

// 1st term: 1

// 2nd term: 1 2 1

// 3rd term: 1 2 1 3 1 2 1

// 4th term: 1 2 1 3 1 2 1 4 1 2 1 3 1 2 1

// And so on. Write a program that takes as parameter an integer n and prints the nth terms of this sequence.

// Example Input:

// 1

// Output:

// 1
import java.util.*;
public class SequencePattern {

    public static String generatePattern(int n) {
        if (n == 1) {
            return "1";
        }

        
        String previousPattern = generatePattern(n - 1);
        return previousPattern + " " + n + " " + previousPattern;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();

        
        String result = generatePattern(input);
        System.out.println(result);
    }
}