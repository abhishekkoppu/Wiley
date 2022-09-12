public class BankAccountApp {
    public static void main(String[] args) {
    BankAccount bankAccount=new BankAccount("A",500);
    BankAccount bankAccount1 = new BankAccount("B",1000);
    BankAccount bankAccount2=new BankAccount("C",0);

    bankAccount.withdrawAmount(100);
    bankAccount1.depositAmount(100);
    bankAccount2.withdrawAmount(100);
    bankAccount1.depositAmount(100);
    bankAccount2.depositAmount(100);
    bankAccount.depositAmount(100);

    }
}
