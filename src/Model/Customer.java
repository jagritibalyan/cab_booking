package Model;

import lombok.Data;

@Data
public class Customer extends User {

    public Customer (String name, char gender, int age){
        super(name, gender,age);
        System.out.println("Created customer: " + name);
    }
}
