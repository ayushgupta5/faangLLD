package Service.User;

import Model.Payment.Payment;
import Model.User.User;

public class UserService implements IUserService {
    @Override
    public void register() {
        System.out.println("Register the User");
    }

    @Override
    public void login(User user) {
        System.out.println("Login the User :" + user.toString());
    }

    @Override
    public void logout(User user) {
        System.out.println("Logout the User :" + user.toString());
    }

    @Override
    public void addFunds(User user, Payment payment) {
        System.out.println("Add Funds to the User :" + user.toString() + " with Payment : " + payment.toString());
    }

    @Override
    public void withDrawFunds(User user, Payment payment) {
        System.out.println("Withdraw Funds from the User :" + user.toString() + " with Payment : " + payment.toString());
    }
}
