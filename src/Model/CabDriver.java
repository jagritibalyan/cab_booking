package Model;

import lombok.Data;

@Data
public class CabDriver extends User{
    private String vehicleNo;

    public CabDriver(String name, char gender, int age, String vehicleNo, Location location) {
        super(name, gender, age, location);
        this.vehicleNo = vehicleNo;
        System.out.println("Created cabDriver: " + name);
    }
}
