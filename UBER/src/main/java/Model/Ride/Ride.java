package Model.Ride;

import Model.Driver.Driver;
import Model.Enum.RideStatus;
import Model.Location.Location;
import Model.User.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ride {
    private String rideID;
    private User rider;
    private Driver driver;
    private Location pickup;
    private Location dropOff;
    private RideStatus status;
    private double fare;
}
