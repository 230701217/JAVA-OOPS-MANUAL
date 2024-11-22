import java.util.*;

class BankAccount {
    // Private field to store the account number
    private String accountNumber;
    // Private field to store the balance
    
    private double balance;

    
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit an amount into the account
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("New balance after depositing $" + amount + ": $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("New balance after withdrawing $" + amount + ": $" + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    // Constructor to initialize account number and balance
    public SavingsAccount(String accountNumber, int balance) {
        super(accountNumber, balance); // Call the parent class constructor
    }

 
    @Override
    public void withdraw(int amount) {
        
        if (getBalance() - amount < 100) {
            System.out.println("Minimum balance of $100 required!");
        } else {
            super.withdraw(amount); 
        }
    }
}

public class BackAccount{
    public static void main(String[] args) {
        System.out.println("Create a Bank Account object (A/c No. BA1234) with initial balance of $500:");
        BankAccount BA1234 = new BankAccount("BA1234", 500);


        System.out.println("Deposit $1000 into account BA1234:");
        BA1234.deposit(1000);

      System.out.println("Withdraw $600 from account BA1234:");
        BA1234.withdraw(600);

    
        System.out.println("Create a SavingsAccount object (A/c No. SA1000) with initial balance of $300:");
        SavingsAccount SA1000 = new SavingsAccount("SA1000", 300);

        System.out.println("Try to withdraw $250 from SA1000!");
        SA1000.withdraw(250);

        
        System.out.println("Balance after trying to withdraw $250: $" + SA1000.getBalance());
    }
}
