public class BankAccountApp {
    public static void main(String[] args) {
    BankAccount bankAccount=new BankAccount(1,"A",500);
    BankAccount bankAccount1 = new BankAccount(2,"B",1000);
    BankAccount bankAccount2=new BankAccount(3,"C",0);

    BankAccount.displayTotalBalance();
    bankAccount.withdrawAmount(100);
    bankAccount1.depositAmount(100);
    bankAccount2.withdrawAmount(100);
    bankAccount1.depositAmount(100);
    bankAccount2.depositAmount(100);
    bankAccount.depositAmount(100);

    }
}
