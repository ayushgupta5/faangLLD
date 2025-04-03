package Service.User;

import Model.Location.Location;

public interface IUserService {
    void requestRide(Location from, Location to);
    void cancelRide();
}
