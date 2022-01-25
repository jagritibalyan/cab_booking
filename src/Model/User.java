package Model;

import lombok.Data;

@Data
public class User {
    private String name;
    private char gender;
    private int age;
    private Location location;

    public User() {}

    public User(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public User(String name, char gender, int age, Location location) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.location = location;
    }

}
