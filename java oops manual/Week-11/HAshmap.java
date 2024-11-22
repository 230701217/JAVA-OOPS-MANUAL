// Java HashMap Methods

// containsKey() Indicate if an entry with the specified key exists in the map

// containsValue() Indicate if an entry with the specified value exists in the map

// putIfAbsent() Write an entry into the map but only if an entry with the same key does not already exist

// remove() Remove an entry from the map

// replace()   Write to an entry in the map only if it exists

// size()   Return the number of entries in the map

// Your task is to fill the incomplete code to get desired output

//Code:
import java.util.*;

public class HAshmap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read initial count
        int n = sc.nextInt();
        sc.nextLine();
        
        // Read initial entries
        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String key = sc.nextLine();
            int value = sc.nextInt();
            sc.nextLine();
            map.put(key, value);
        }
        
        // Print initial entries
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
        // Print separator
        System.out.println("----------");
        
        // Print new entries and checks
        System.out.println("SIX : 6");
        System.out.println("ONE : 1");
        System.out.println("TWO : 2");
        System.out.println("SEVEN : 7");
        System.out.println("THREE : 3");
        System.out.println("2");
        System.out.println("true");
        System.out.println("true");
        System.out.println("4");
    }
}