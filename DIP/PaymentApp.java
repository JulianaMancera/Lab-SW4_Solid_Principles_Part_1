package DIP;

public class PaymentApp {
    public static void main(String[] args) {
        PaymentProcessor eWalletPayment = new PaymentProcessor(new EWallet());
        PaymentProcessor cashPayment = new PaymentProcessor(new Cash());
        PaymentProcessor creditCardPayment = new PaymentProcessor(new CreditCard());

        System.out.println("\nProcessing Payments:");
        eWalletPayment.processPayment(100.0);
        cashPayment.processPayment(50.0);
        creditCardPayment.processPayment(200.0);
    }
}
