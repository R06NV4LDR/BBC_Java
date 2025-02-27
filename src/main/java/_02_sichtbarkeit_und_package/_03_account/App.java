package _02_sichtbarkeit_und_package._03_account;

public class App {
    public static void main(String[] args) {
        Account.deposit(1000);
        System.out.println("Accountbalance: " + Account.balance + " " + Account.getCurrency());
        Account.setInterestRate(0.05);
        System.out.println("Fälliger Zins: " + Account.getInterest()  + " " + Account.getCurrency());
        Account.withdraw(25);
        System.out.println("Accountbalance: " + Account.balance + " " + Account.getCurrency());
        Account.deposit(50);
        System.out.println("Accountbalance: " + Account.balance + " " + Account.getCurrency());
        System.out.println("Zinsrate :" + Account.getInterestRate() + " %");

    }
}
