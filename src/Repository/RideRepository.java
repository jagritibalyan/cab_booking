package Repository;

import Model.Customer;
import Model.Ride;
import lombok.Data;

import java.util.HashMap;

@Data
public class RideRepository {
    public static HashMap<String, Ride> customerRidesMap;
    public static HashMap<String, Ride> driverRidesMap;

    public RideRepository() {
        customerRidesMap = new HashMap<>();
        driverRidesMap = new HashMap<>();
    }
}
