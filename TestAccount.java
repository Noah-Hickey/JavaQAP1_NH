
public class TestAccount {
    public static void main(String[] args) {

        // Creating two accounts (Ensure balance is double by using 5000.0) //
        Account acc1 = new Account(101, 5000.0);
        Account acc2 = new Account(102, 4000.0);

        // Displaying initial balances //
        System.out.println(acc1);
        System.out.println(acc2);

        // Transfer $1000 from acc1 to acc2 //
        System.out.println("\nTransferring $1000 from Account 101 to Account 102...\n");
        acc1.transfer(acc2, 1000.0); // Ensure transfer amount is double

        // Displaying balances after transfer //
        System.out.println("\nFinal Account Balances:");
        System.out.println(acc1);
        System.out.println(acc2);
    }
}

