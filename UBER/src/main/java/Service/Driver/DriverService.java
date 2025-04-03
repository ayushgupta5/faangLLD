package Service.Driver;

import Model.Ride.Ride;

public class DriverService implements IDriverService {
    @Override
    public void acceptRide(Ride ride) {
        System.out.println("Accept the Ride : " +ride.toString());
    }

    @Override
    public void completeRide(Ride ride) {
        System.out.println("Complete the Ride : " +ride.toString());
    }
}
