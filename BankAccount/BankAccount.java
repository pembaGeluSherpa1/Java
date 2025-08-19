package BankAccount;

public class BankAccount {
    static int amount;

    int deposite(int amt){
        amount += amt;
        System.out.println("Deposited ammount: "+ amt);
        return amount;
    }

    void totalAmount(){
        System.out.println("Total Amount: "+ amount);
    }

    int withdraw(int cash){
        if(amount<100 || amount<cash || cash<100){
            System.out.println("Insufficient amount: "+cash);
            return amount;
        }else{
        amount-=cash;
        System.out.println("cash withdraw: "+cash);
        return amount;
        }
    }
}
