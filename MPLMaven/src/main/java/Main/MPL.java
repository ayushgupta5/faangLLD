package Main;


import Model.User.User;

public class MPL {
    public static void main(String[] args) {
        User user = User.builder().userID(1).userName("Ayush").walletBalance(100.00).passwordHash("password").build();
        System.out.println(user);

    }
}
