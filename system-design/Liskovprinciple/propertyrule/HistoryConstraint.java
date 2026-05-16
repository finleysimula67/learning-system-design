//import java.util.ArrayList;
//
//class BankAccount {
//    int balance = 0;
//
//    // History list
//    ArrayList<String> history = new ArrayList<>();
//
//    // Deposit method
//    void deposit(int amount) {
//        balance += amount;
//        history.add("Deposited: " + amount);
//    }
//
//    // Withdraw method
//    void withdraw(int amount) {
//        if (amount <= balance) {
//            balance -= amount;
//            history.add("Withdrawn: " + amount);
//        } else {
//            history.add("Failed Withdrawal: " + amount);
//        }
//    }
//
//    // Show history
//    void showHistory() {
//        System.out.println("Transaction History:");
//
//        for (String h : history) {
//            System.out.println(h);
//        }
//    }
//}
//
//public class HistoryConstraint {
//    public static void main(String[] args) {
//
//        BankAccount b = new BankAccount();
//
//        b.deposit(500);
//        b.withdraw(200);
//        b.withdraw(1000);
//
//        b.showHistory();
//    }
//}