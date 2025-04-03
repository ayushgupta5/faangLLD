package Service.Payment;

import Model.Payment.Payment;

public interface PaymentStrategy {
    void processPayment(Payment payment);
}
