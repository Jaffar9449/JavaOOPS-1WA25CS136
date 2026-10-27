// Abstract class: common structure for all payment methods
abstract class Payment {
    protected double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    // Every payment method MUST implement pay(), each in its own way
    abstract void pay();

    // Concrete method shared by all subclasses
    void showReceipt() {
        System.out.println("Receipt: Rs. " + amount + " paid successfully.\n");
    }
}

class CreditCardPayment extends Payment {
    private String cardHolder;
    private String cardNumber;

    CreditCardPayment(double amount, String cardHolder, String cardNumber) {
        super(amount);
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
    }

    @Override
    void pay() {
        String masked = "XXXX-XXXX-XXXX-" + cardNumber.substring(cardNumber.length() - 4);
        System.out.println("Credit Card Payment");
        System.out.println("Card Holder : " + cardHolder);
        System.out.println("Card Number : " + masked);
        System.out.println("Verifying card details and OTP...");
        System.out.println("Amount Rs. " + amount + " charged to credit card.");
    }
}

class UPIPayment extends Payment {
    private String upiId;

    UPIPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void pay() {
        System.out.println("UPI Payment");
        System.out.println("UPI ID : " + upiId);
        System.out.println("Sending collect request and verifying UPI PIN...");
        System.out.println("Amount Rs. " + amount + " transferred via UPI.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Abstract class reference -> subclass objects (runtime polymorphism)
        Payment p1 = new CreditCardPayment(2500.00, "Asha Rao", "1234567812345678");
        Payment p2 = new UPIPayment(799.50, "asha@okbank");


        
        p1.pay();
        p1.showReceipt();
        p2.pay();
        p2.showReceipt();
        
    }
}
