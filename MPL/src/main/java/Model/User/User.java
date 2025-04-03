package Model.User;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private int userID;
    private String userName;
    private String passwordHash;
    private double walletBalance;
}
