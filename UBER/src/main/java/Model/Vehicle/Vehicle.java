package Model.Vehicle;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Vehicle {
    private String vehicleID;
    private String model;
    private String licensePlate;
    private String driver;
}
