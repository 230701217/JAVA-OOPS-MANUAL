// if the input numbers are 267 and 154, the sum of last two digits should be 11

// if the input numbers are 267 and -154, the slim of last two digits should be 11

// if the input numbers are -267 and 154, the sum of last two digits should be 11

// if the input numbers are -267 and -154, the sum of last two digits should be 11

import java.util.Scanner;

class prog {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int n1 = Math.abs(num1 % 10);
        int n2 = Math.abs(num2 % 10);
        
        System.out.println(n1 + n2);
    }
}