
public class BankAccount {
    private int accountId;
    private String accountHolderName;
    private double openingBalance;
    private double currentBalance;
    private double totalBalance;
    private static int count=000;




    public BankAccount( String accountHolderName, double openingBalance) {
        if (openingBalance >= 0) {
            this.accountId = ++count;
            this.accountHolderName = accountHolderName;
            this.openingBalance = openingBalance;
            this.currentBalance = openingBalance;
            this.totalBalance = this.currentBalance;
        } else {
            System.out.println("Opening Balance should be positive. Please try again");
        }
    }

    public void depositAmount(double amount) {
            if(amount>=0){
                this.openingBalance=this.currentBalance;
                this.currentBalance+=amount;
                this.totalBalance=this.currentBalance;
                System.out.println("Amount "+amount+ " deposited successfully");
                displayAccountDetails();
            }
            else {

                System.out.println("Cannot deposit negative amount");
                System.out.println("----------------------------------");
                System.out.println();
            }
            }



    public void withdrawAmount(double amount) {
if(this.currentBalance>amount){
    this.openingBalance=this.currentBalance;
    this.currentBalance-=amount;
    this.totalBalance=currentBalance;
    System.out.println("Amount "+amount+" Withdrawn successfully");
    displayAccountDetails();

}
else {
    getCurrentBalance();
    System.out.println("Your current balance is less than withdraw amount. Try again");
    System.out.println("----------------------------------");
    System.out.println();
}
    }

    public void displayAccountDetails(){
        System.out.println("Account Id: "+ this.accountId);
        System.out.println("Account Holder Name: "+ this.accountHolderName);
        System.out.println("Your Opening balance: "+ this.openingBalance);
        getCurrentBalance();
        displayTotalBalance();
        System.out.println("-------------------------------");
        System.out.println();
    }

    public void getCurrentBalance() {
        System.out.println("Current balance in your account is: "+this.currentBalance);
    }

    public void displayTotalBalance() {
        System.out.println("Total balance in your account is :"+this.totalBalance);
    }
}
