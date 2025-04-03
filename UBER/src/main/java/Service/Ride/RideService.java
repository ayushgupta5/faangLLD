package Service.Ride;

import Model.Ride.Ride;

public class RideService implements IRideService {
    @Override
    public void startRide(Ride ride) {
        System.out.println("Start The Ride : " +ride.toString());
    }

    @Override
    public void completeRide(Ride ride) {
        System.out.println("Complete The Ride : " +ride.toString());
    }
}
