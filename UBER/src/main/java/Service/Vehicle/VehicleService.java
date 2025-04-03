package Service.Vehicle;

import Model.Vehicle.Vehicle;

public class VehicleService implements IVehicleService {
    @Override
    public void updateAvailability(Vehicle vehicle) {
        System.out.println("Update The Availability : " + vehicle.toString());
    }
}
