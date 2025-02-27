package _03_von_klassen_zu_objekten._02_account.teil1;

public class Account {
    double balance = 0;
    double interestRate = 0.01;
    public static String currency = "CHF";

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getInterest() {
        return balance * interestRate;
    }

    public String getCurrency() {
        return currency;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException(
                    "The amount has to be greater than 0 when depositing");
        }
    }

    public void withdraw(double amount) {
        if (balance > 0) {
            amount -= balance;
        } else {
            throw new IllegalArgumentException(
                    "The balance has to be greater than the amount for withdrawing");
        }
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public static Account[] createAccounts(int numberOfAccountsToCreate) {
        Account[] accounts = new Account[numberOfAccountsToCreate];
        for (int i = 0; i < numberOfAccountsToCreate; i++) {
            accounts[i] = new Account();
        }
        return accounts;
    }

    public static Account getMax(Account[] accounts) {
        Account maxAccount = accounts[0];
        for (Account account : accounts) {
            if (account.getBalance() > maxAccount.getBalance()) {
                maxAccount = account;
            }
        }
        return maxAccount;
    }

}