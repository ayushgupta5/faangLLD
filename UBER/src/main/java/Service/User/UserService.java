package Service.User;

import Model.Location.Location;

public class UserService implements IUserService{
    @Override
    public void requestRide(Location from, Location to) {
        System.out.println("Request Ride from : " +from + " to : " + to);
    }

    @Override
    public void cancelRide() {
        System.out.println("Cancelling the Ride");
    }
}
