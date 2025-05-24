package BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount Bank= new BankAccount();
        Bank.deposite(100000);
        Bank.deposite(100000);
        Bank.totalAmount();
        // Bank.withdraw(200100);
        Bank.withdraw(190000);
        Bank.totalAmount();
        Bank.withdraw(90);
    }
}
