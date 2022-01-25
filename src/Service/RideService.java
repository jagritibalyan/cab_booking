package Service;

import Model.CabDriver;
import Model.Customer;
import Model.Location;
import Model.Ride;
import Repository.RideRepository;
import Repository.UserRepository;

import java.util.ArrayList;

public class RideService {

    public ArrayList<CabDriver> findRide(String customerName, Location src, Location dest) {
        return UserRepository.cabdriversList;
    }

    public Ride chooseRide(String customerName, String driverName) {
        Customer customer = UserRepository.customerMap.get(customerName);
        CabDriver cabdriver = UserRepository.cabdriverMap.get(driverName);
        UserRepository.customerCabdriverMap.put(customer, cabdriver);
        Ride ride = new Ride();
        ride.setCabDriver(cabdriver);
        ride.setCustomer(customer);
        RideRepository.customerRidesMap.put(customerName, ride);
        return ride;
    }

    public int calculateBill(String customerName) {
        Ride ride = RideRepository.customerRidesMap.get(customerName);
        int amount = 100;
        ride.setAmount(amount);
        UserRepository.cabdriverEarningMap.put(ride.getCabdriver().getName(), amount);
        return amount;
    }
}
