package Service.Ride;

import Model.Ride.Ride;

public interface IRideService {
    void startRide(Ride ride);
    void completeRide(Ride ride);
}
