package Model.Driver;

import Model.Vehicle.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Driver {
    private String driverID;
    private Vehicle vehicle;
    private boolean isAvailable;
    private double rating;
}
