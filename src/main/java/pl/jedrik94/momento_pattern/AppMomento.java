package pl.jedrik94.momento_pattern;

import pl.jedrik94.momento_pattern.model.BankAccount;
import pl.jedrik94.momento_pattern.model.MomentoBankAccount;

public class AppMomento {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        MomentoBankAccount m1 = bankAccount.deposit(100);
        MomentoBankAccount m2 = bankAccount.deposit(25);

        System.out.println(bankAccount);

        bankAccount.restore(m1);

        System.out.println(bankAccount);
    }
}
