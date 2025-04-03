package Model.Payment;

import Model.Enum.PaymentStatus;
import Model.Ride.Ride;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Payment {
    private String paymentID;
    private Ride ride;
    private double amount;
    private PaymentStatus status;
    private String TransactionType;
}
