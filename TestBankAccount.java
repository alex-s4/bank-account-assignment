package bankAccountAssignment;

/**
 * TestBankAccount
 */
public class TestBankAccount {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        account1.depositBalance(1000, "savings");
        account1.depositBalance(20000, "checking");
        account2.depositBalance(3000, "checking");
        account2.depositBalance(500, "checking");
        account3.depositBalance(485.54, "savings");

        account1.withdrawBalance(200, "savings");
        account1.withdrawBalance(14200, "checking");

        // account1.displayCurrentBalance();
        // account2.displayCurrentBalance();
        // account3.displayCurrentBalance();

        // System.out.println(account1.accountNumber);
        // System.out.println(account2.accountNumber);
        // System.out.println(account3.accountNumber);


    }
}