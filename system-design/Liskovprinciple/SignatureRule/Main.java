class Payment {

    public void pay(double amount) {
        System.out.println("Payment done: " + amount);
    }
}

class KhaltiPayment extends Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Khalti payment done: " + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Payment p = new KhaltiPayment();
        p.pay(100);
    }
}