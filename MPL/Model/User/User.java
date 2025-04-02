package Model.User;


public class User {
    private int userID;
    private String userName;
    private String passwordHash;
    private double walletBalance;

    private User(Builder builder) {
        this.userID = builder.userID;
        this.userName = builder.userName;
        this.passwordHash = builder.passwordHash;
        this.walletBalance = builder.walletBalance;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", walletBalance=" + walletBalance +
                '}';
    }

    public static class Builder {
        private int userID;
        private String userName;
        private String passwordHash;
        private double walletBalance;

        public Builder setUserID(int userID) {
            this.userID = userID;
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder setPasswordHash(String passwordHash) {
            this.passwordHash = passwordHash;
            return this;
        }

        public Builder setWalletBalance(double walletBalance) {
            this.walletBalance = walletBalance;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
