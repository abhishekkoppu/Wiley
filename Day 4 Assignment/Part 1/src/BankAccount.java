public class BankAccount {
    private static double totalBalance;
    private int accountId;
    private String accountHolderName;
    private double openingBalance;
    private double currentBalance;


    public BankAccount(int accountId, String accountHolderName, double openingBalance) {
        if (openingBalance >= 0) {
            this.accountId = accountId;
            this.accountHolderName = accountHolderName;
            this.openingBalance = openingBalance;
            this.currentBalance = openingBalance;
            totalBalance += this.currentBalance;
        } else {
            System.out.println("Opening Balance should be positive. Please try again");
        }
    }

    public void depositAmount(double amount) {
        if (amount >= 0) {

            this.currentBalance += amount;
            totalBalance += amount;
            System.out.println("Amount " + amount + " deposited successfully");

            System.out.println("Account Id: " + this.accountId);
            System.out.println("Account Holder Name: " + this.accountHolderName);
            getCurrentBalance();
            displayTotalBalance();
            System.out.println("-------------------------------");
            System.out.println();
        } else {

            System.out.println("Cannot deposit negative amount");
            System.out.println("----------------------------------");
            System.out.println();
        }
    }


    public void withdrawAmount(double amount) {
        if (this.currentBalance > amount) {

            this.currentBalance -= amount;
            totalBalance -= amount;
            System.out.println("Amount " + amount + " Withdrawn successfully");

            System.out.println("Account Id: " + this.accountId);
            System.out.println("Account Holder Name: " + this.accountHolderName);
            getCurrentBalance();
            displayTotalBalance();
            System.out.println("-------------------------------");
            System.out.println();

        } else {
            getCurrentBalance();
            System.out.println("Your current balance is less than withdraw amount. Try again");
            System.out.println("----------------------------------");
            System.out.println();
        }
    }

    public void getCurrentBalance() {
        System.out.println("Current balance in your account is: " + this.currentBalance);
    }

    public static void displayTotalBalance() {
        System.out.println("Total balance in the bank is :" + totalBalance);
    }
}
