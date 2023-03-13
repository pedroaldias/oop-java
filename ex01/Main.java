package ex01;

public class Main {
    public static void main(String[] args) {
        BankA bank01 = new BankA();
        BankB bank02 = new BankB();
        BankC bank03 = new BankC();
        
        bank01.getBalance();
        bank02.getBalance();
        bank03.getBalance();
    }
}
