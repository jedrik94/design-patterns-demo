package pl.jedrik94.momento_pattern.model;

public class BankAccount {
    private int balance;

    public BankAccount() {
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }

    public MomentoBankAccount deposit(int amount) {
        balance += amount;
        return new MomentoBankAccount(balance);
    }

    public void restore(MomentoBankAccount momento) {
        this.balance = momento.getBalance();
    }
}
