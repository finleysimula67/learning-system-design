class BankAccount {
    int deposit(int amount) {
        return amount;
    }

    int withdraw(int amount) {
        return amount;
    }
}

class SavingsAccount extends BankAccount {
    int withdraw(int amount) {
        if (amount > 10000) {
            return 10000;
        }
        return amount;
    }
}

class FixedDepositAccount extends BankAccount {
    int withdraw(int amount) {
        if (amount < 0)
            throw new RuntimeException("amount cannot be negative");

        return 0;
    }
}

public class BankAccoundSystem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.withdraw(1000);

    }
}
