
public class Account {
    private final int accountNumber;
    private double balance;  // Ensure balance is double

    // Constructor
    public Account(int accountNumber, double balance) { // Ensure balance is double
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + ". Remaining Balance: $" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Transfer money
    public void transfer(Account recipient, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            recipient.deposit(amount);
            System.out.println("Transferred $" + amount + " to Account #" + recipient.getAccountNumber());
        } else {
            System.out.println("Transfer failed due to insufficient balance or invalid amount.");
        }
    }

    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // toString method
    @Override
    public String toString() {
        return "Account[Account Number: " + accountNumber + ", Balance: $" + balance + "]";
    }
}

