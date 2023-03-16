package bankAccountAssignment;

public class BankAccount{
    
    // The class should have the following attributes: (double) checking balance, (double) savings balance.
    private double checkingBalance = 0;
    private double savingsBalance = 0;

    // Create a class member (static) that has the number of accounts created thus far.
    public static int accountsCreated = 0;

    // Create a class member (static) that tracks the total amount of money stored in every account created.
    static double totalMoneyStored = 0;

    // In the constructor, be sure to increment the account count.
    public BankAccount(){
        accountsCreated++;
    }

    // Create a getter method for the user's checking and saving account balance.
    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }
}