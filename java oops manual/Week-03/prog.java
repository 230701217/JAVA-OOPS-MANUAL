import java.util.Scanner;

public class prog {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)  arr[i] = sc.nextInt();
        
        int max = 0;
        
        for(int i = 0; i < n; i++) {
            if(arr[i] > max)    max = arr[i];
        }
        
        for(int i = 0; i < n; i++) {
            arr[i] = (arr[i] - max) * max;
        }
        
        for(int i = 0; i < n; i++)  System.out.print(arr[i] + " ");
    }
}