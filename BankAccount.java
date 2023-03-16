package bankAccountAssignment;

public class BankAccount{
    
    // The class should have the following attributes: (double) checking balance, (double) savings balance.
    private double checkingBalance;
    private double savingsBalance;

    // Create a class member (static) that has the number of accounts created thus far.
    public static int accountsCreated = 0;

    // Create a class member (static) that tracks the total amount of money stored in every account created.
    static double totalMoneyStored;

    public BankAccount(){
        accountsCreated++;
    }
}