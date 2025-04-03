package Service.Driver;

import Model.Ride.Ride;

public interface IDriverService {
    void acceptRide(Ride ride);
    void completeRide(Ride ride);
}
