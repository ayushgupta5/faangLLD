package Service.Payment;

import Model.Payment.Payment;

public class PaymentService {
    PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(Payment payment) {
        paymentStrategy.processPayment(payment);
    }
}
