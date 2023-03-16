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

    // Create a method that will allow a user to deposit money into either the checking or
    // saving, be sure to add to total amount stored.
    public void depositBalance(double amountToDeposit, String accountType){
        if(accountType.equals("savings")){
            savingsBalance+=amountToDeposit;
            totalMoneyStored+=amountToDeposit;
        } else if(accountType.equals("checking")){
            checkingBalance+=amountToDeposit;
            totalMoneyStored+=amountToDeposit;
        }
    }

    // Create a method to withdraw money from one balance. Do not allow them to 
    // withdraw money if there are insufficient funds.
    public void withdrawBalance(double amountToWithdraw, String accountType){
        if ((checkingBalance<amountToWithdraw && accountType.equals("checking")) || (savingsBalance<amountToWithdraw && accountType.equals("savings"))){
            System.out.println("You have INSUFFICIENT BALANCE!");
        } else if (checkingBalance>amountToWithdraw && accountType.equals("checking")){
            checkingBalance-=amountToWithdraw;
        } else if (savingsBalance>amountToWithdraw && accountType.equals("savings")){
            savingsBalance-=amountToWithdraw;
        }
    }

    // Create a method to see the total money from the checking and saving.
    public void displayCurrentBalance(){
        System.out.println(String.format("Your Current Balance:\nSavings: %.2f\nChecking: %.2f", savingsBalance, checkingBalance));
    }

    // Create a getter method for the user's checking and saving account balance.
    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }
}