abstract class Bank {
    public abstract int getBalance();
}
class BankA extends Bank{
    private int balance;
    public BankA(int balance){
        this.balance=balance;
    }
    public int getBalance(){
        return balance;
    }
}
class BankB extends Bank{
    private int balance;
    public BankB(int balance){
        this.balance=balance;
    }
    public int getBalance(){
        return balance;
    }
}
class BankC extends Bank{
    private int balance;
    public BankC(int balance){
        this.balance=balance;
    }
    public int getBalance(){
        return balance;
    }
}
public class Main2{
    public static void main(String[] args){
        Bank bankA=new BankA(100);
        Bank bankB=new BankB(150);
        Bank bankC=new BankC(120);
        System.out.println(bankA.getBalance());
        System.out.println(bankB.getBalance());
        System.out.println(bankC.getBalance());
    }
}
