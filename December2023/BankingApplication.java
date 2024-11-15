/* Create a Java program for a banking application featuring a BankAccount class and a custom exception called InsufficientFundsException. The BankAccount class should include attributes for account number, account holder name, and current balance. Its withdraw method should throw InsufficientFundsException if the withdrawal amount exceeds the current balance. In the main 
method of another class, showcase the usage of the BankAccount class by creating an account, setting an initial balance, and attempting a withdrawal operation that could trigger the custom exception */

// Custom exception class for insufficient funds
class InsufficientFundsException extends Exception {
    // Constructor to pass the error message to the Exception class
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// BankAccount class to handle bank account operations
class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor to initialize the bank account with account number, holder name, and balance
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Method to withdraw an amount from the account
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            // If the withdrawal amount exceeds the balance, throw the custom exception
            throw new InsufficientFundsException("Insufficient funds! Your balance is only " + balance);
        } else {
            // Deduct the amount from the balance if funds are sufficient
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }

    // Method to deposit an amount into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }
}

// Main class to run the banking application
public class BankingApplication {

    public static void main(String[] args) {
        // Create a new bank account with initial balance
        BankAccount account = new BankAccount("123456", "John Doe", 1000.0);

        // Display account details
        account.displayAccountDetails();

        // Try withdrawing an amount larger than the balance to trigger InsufficientFundsException
        try {
            System.out.println("\nAttempting to withdraw $1500...");
            account.withdraw(1500);  // This should trigger the custom exception
        } catch (InsufficientFundsException e) {
            // Handle the InsufficientFundsException and display the error message
            System.out.println("Error: " + e.getMessage());
        }

        // Deposit some money into the account
        account.deposit(500.0);

        // Try a successful withdrawal
        try {
            System.out.println("\nAttempting to withdraw $800...");
            account.withdraw(800);  // This should be successful
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display account details after the transactions
        account.displayAccountDetails();
    }
}

/* SAMPLE OUTPUT
  Account Number: 123456
  Account Holder: John Doe
  Current Balance: 1000.0

  Attempting to withdraw $1500...
  Error: Insufficient funds! Your balance is only 1000.0
  Deposit successful. New balance: 1500.0

  Attempting to withdraw $800...
  Withdrawal successful. New balance: 700.0
  Account Number: 123456
  Account Holder: John Doe
  Current Balance: 700.0
*/