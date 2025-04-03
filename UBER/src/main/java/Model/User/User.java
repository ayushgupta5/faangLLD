package Model.User;

import Model.Location.Location;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private String userID;
    private String name;
    private String phone;
    private String email;
    private Location currentLocation;
}
