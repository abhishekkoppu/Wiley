public class BankAccount {
    AcccountType acccountType;
    private static double totalBalance;
    private int accountId;
    private String accountHolderName;
    private double openingBalance;
    private double currentBalance;


    public BankAccount(int accountId, String accountHolderName, double openingBalance, AcccountType acccountType) {

        this.acccountType=acccountType;

        if (openingBalance >= this.acccountType.getMinBal()) {
            this.accountId = accountId;
            this.accountHolderName = accountHolderName;
            this.openingBalance = openingBalance;
            this.currentBalance = openingBalance;
            totalBalance += this.currentBalance;
        } else {
            System.out.println("Minumum Opening Balance for "+this.acccountType+ "account is "+ this.acccountType.getMinBal()+" Please try again");
        }
    }

    public void depositAmount(double amount) {
        if (amount > 0 && this.accountHolderName!=null) {


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

            System.out.println("Cannot deposit negative or zero amount");
            System.out.println("----------------------------------");
            System.out.println();
        }
    }


    public void withdrawAmount(double amount) {
        if (this.currentBalance-this.acccountType.getMinBal() >= amount ) {

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
            System.out.println("You cannot withdraw your minimum balance. Please Try again");
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
