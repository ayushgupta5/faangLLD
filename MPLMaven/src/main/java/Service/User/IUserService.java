package Service.User;

import Model.Payment.Payment;
import Model.User.User;

public interface IUserService {
    void register();
    void login(User user);
    void logout(User user);
    void addFunds(User user, Payment payment);
    void withDrawFunds(User user, Payment payment);
}
