package Main;

import Model.Driver.Driver;
import Model.Location.Location;
import Model.Payment.Payment;
import Model.Ride.Ride;
import Model.User.User;
import Model.Vehicle.Vehicle;
import Service.Driver.DriverService;
import Service.Driver.IDriverService;
import Service.Payment.CreditCard;
import Service.Payment.PaymentService;
import Service.Payment.PaymentStrategy;
import Service.Payment.UPI;
import Service.Ride.IRideService;
import Service.Ride.RideService;
import Service.User.IUserService;
import Service.User.UserService;
import Service.Vehicle.IVehicleService;
import Service.Vehicle.VehicleService;

import java.util.Objects;

import static Model.Enum.PaymentStatus.PENDING;
import static Model.Enum.RideStatus.REQUESTED;

public class Uber {
    public static void main(String [] args) {
        Vehicle vehicle = new Vehicle("1", "BMW", "1234", "Ayush");
        Driver driver = new Driver("1", vehicle, true, 9.88);
        Location from = new Location(28.6139, 77.2090); // Delhi
        Location to = new Location(19.0760, 72.8777);   // Mumbai
        User rider = new User("1", "Ayush", "11111", "ayush@gmail.com", from);
        Ride ride = new Ride("1", rider, driver, from, from, REQUESTED, 111.11);
        Payment payment = new Payment("1", ride, 111.11, PENDING, "UPI");

        IDriverService driverService = new DriverService();
        driverService.acceptRide(ride);
        driverService.completeRide(ride);

        IUserService userService = new UserService();
        userService.requestRide(from, to);
        userService.cancelRide();

        IRideService rideService = new RideService();
        rideService.startRide(ride);
        rideService.completeRide(ride);

        IVehicleService vehicleService = new VehicleService();
        vehicleService.updateAvailability(vehicle);
        Payment(payment);
        payment.setTransactionType("CreditCard");
        Payment(payment);

    }

    private static void Payment(Payment payment) {
        PaymentStrategy paymentStrategy;
        if(Objects.equals(payment.getTransactionType(), "UPI")) {
            paymentStrategy = new UPI();
        } else {
            paymentStrategy = new CreditCard();
        }

        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(paymentStrategy);
        paymentService.pay(payment);
    }
}
