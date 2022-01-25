package Driver;

import Model.*;
import Repository.RideRepository;
import Repository.UserRepository;
import Service.RideService;
import Service.UserService;

import java.util.ArrayList;

public class Main {
    public static void main (String [] args)  {
        System.out.println("Welcome to Cab Booking App");

        UserRepository userRepository = new UserRepository();
        RideRepository rideRepository = new RideRepository();

        UserService us = new UserService();
        RideService rs = new RideService();

        Customer c1 = new Customer("Mayank", 'M', 26);
        CabDriver d1 = new CabDriver("Driver1", 'M', 30, "Swift DL12xyd", new Location(1, 1));

        userRepository.addCustomer(c1);
        userRepository.addCabdriver(d1);

        us.updateCustomerLocation("Mayank", new Location(0, 0));

        ArrayList<CabDriver> availableCabdrivers = rs.findRide("Mayank", new Location(0, 0), new Location(5,5));
        System.out.println(availableCabdrivers);

        Ride chosenRide = rs.chooseRide("Mayank", availableCabdrivers.get(0).getName());
        System.out.println(chosenRide);

        int bill = rs.calculateBill("Mayank");

        System.out.println(bill);

        us.findTotalEarning();
    }
}
