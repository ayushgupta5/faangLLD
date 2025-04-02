package Main;

import Model.User.User;

public class MPL {
    public static void main(String[] args) {
        User user = new User.Builder().setUserID(1).setUserName("Ayush").setPasswordHash("Password").build();
    }
}
