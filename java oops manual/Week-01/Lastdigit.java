// For example,

// if the given number is 197, the last digit is 7

// if the given number is -197, the last digit is 7
import java.util.Scanner;

public class Lastdigit{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        System.out.println(Math.abs(n%10));
    }
}