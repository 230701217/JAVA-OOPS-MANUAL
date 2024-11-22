// 82 is even.
// Error: 37 is odd.

class prog {
    public static void main(String[] args) {
        int n = 82;
        trynumber(n);  
        
        n = 37;
        trynumber(n);  
    }

    
    public static void trynumber(int n) {
        try {
            checkEvenNumber(n); 
            System.out.println(n + " is even.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());  
        }
    }

    public static void checkEvenNumber(int number) {
        if (number % 2 != 0) {
            throw new IllegalArgumentException(number + " is odd.");  
        }
    }
}
