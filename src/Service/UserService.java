package Service;

import Model.Location;
import Repository.UserRepository;

import java.util.Map;

public class UserService {

    public void updateCustomerLocation(String name, Location location){
        if (UserRepository.customerMap.containsKey(name)) {
            UserRepository.customerMap.get(name).setLocation(location);
            System.out.println("customer " + name + " location changed");
        }
        System.out.println("No user with this name");
    }

    public void findTotalEarning() {
        for (Map.Entry<String, Integer> i: UserRepository.cabdriverEarningMap.entrySet()) {
            System.out.println(i.getKey() + " : " + i.getValue());
        }
    }
}
