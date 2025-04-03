package Model.Payment;

import Model.User.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Payment {
    private int paymentID;
    private double amount;
    private String transactionType;
    private User user;
}
