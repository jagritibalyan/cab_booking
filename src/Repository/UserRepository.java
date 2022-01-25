package Repository;

import Model.CabDriver;
import Model.Customer;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;

@Data
public class UserRepository {
    public static ArrayList<Customer> customersList;
    public static ArrayList<CabDriver> cabdriversList;

    public static HashMap<String, Customer> customerMap;
    public static HashMap<String, CabDriver> cabdriverMap;
    public static HashMap<String, Integer> cabdriverEarningMap;

    public static HashMap<Customer, CabDriver> customerCabdriverMap;

    public UserRepository() {
        customersList = new ArrayList<>();
        cabdriversList = new ArrayList<>();
        customerMap = new HashMap<>();
        cabdriverMap = new HashMap<>();
        customerCabdriverMap = new HashMap<>();
        cabdriverEarningMap = new HashMap<>();
    }

    public void addCustomer(Customer c){
        customersList.add(c);
        customerMap.put(c.getName(), c);
        System.out.println("customer added to repository: " + c.getName());
    }

    public void addCabdriver(CabDriver d){
        cabdriversList.add(d);
        cabdriverMap.put(d.getName(), d);
        System.out.println("cabDriver added to repository: " + d.getName());
    }
}
