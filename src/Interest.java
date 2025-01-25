import java.util.Scanner;

abstract class BankAccount{
    abstract void calculateInterest();
    void showBalance(int balance){
        System.out.println("Account balance is : "+balance);
    }
}
class SavingsAccount extends BankAccount{
    private int balance;

    SavingsAccount(int balance) {
        this.balance = balance;
    }

    void calculateInterest(){
        double interest=balance*0.05;
        System.out.println("The interest is: "+interest);

    }
}
public class Interest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int balance= sc.nextInt();
        SavingsAccount savingsAccount = new SavingsAccount(balance);
        savingsAccount.showBalance(balance);
        savingsAccount.calculateInterest();

    }
}
