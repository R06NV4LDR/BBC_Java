package _03_von_klassen_zu_objekten._02_account.teil1;

public class AccountApp {

    public static void main(String[] args) {
        Account[] accounts = Account.createAccounts(10);

        for (int i = 0; i < 10; i++) {
            accounts[i].deposit(RandomHelper.getRandomDouble(1, 1000));
            accounts[i].withdraw(RandomHelper.getRandomDouble(1, 1000));
        }

        Account maxAccount = Account.getMax(accounts);
        System.out.println("Account with the highest balance: " + maxAccount.getBalance());

    }
}