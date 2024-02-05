package OOPs;

public class Bank_Account {
    
    // Instance variables
    String name;
    double balance;
    int accountNumber;

    // Constructor to initialize objects
    public Bank_Account(String name, double initialBalance, int accountNumber) {
        this.name = name;
        this.balance = initialBalance;
        this.accountNumber = accountNumber;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited amount: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn amount: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    // Method to check balance
    public double checkBalance() {
        return balance;
    }

    // Display account information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Initial Balance: " + balance);
        System.out.println("Account Number: " + accountNumber);
    }
}

class Bank {
    public static void main(String[] args) {
        // Create an object of BankAccount
        Bank_Account account = new Bank_Account("Vivek", 1000, 10101);
        
        // Display account information
        account.displayInfo();
        
        // Perform transactions
        account.deposit(500);
        account.withdraw(200);
        
        // Display updated balance
        System.out.println("Updated Balance: " + account.checkBalance());
    }
}
