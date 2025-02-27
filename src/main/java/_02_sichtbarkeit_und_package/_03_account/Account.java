package _02_sichtbarkeit_und_package._03_account;

public class Account {
    static double balance = 0;
    static double interestRate = 0.01;
    public static String currency = "CHF";

    public static double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static double getInterest() {
        return  balance * interestRate;
    }

    public static String getCurrency() {
        return currency;
    }

    public static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException(
                    "The amount has to be greater than 0 when depositing");
        }
    }

    public static void withdraw(double amount) {
        if (balance > 0) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException(
                    "The balance has to be greater than the amount for withdrawing");
        }
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static Account[] createAccounts(int numberOfAccountsToCreate) {
        Account[] accounts = new Account[numberOfAccountsToCreate];
        for (int i = 0; i < numberOfAccountsToCreate; i++) {
            accounts[i] = new Account();
        }
        return accounts;
    }
}