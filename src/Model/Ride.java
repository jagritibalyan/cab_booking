package Model;

import lombok.Data;

@Data
public class Ride {
    private Customer customer;
    private CabDriver cabdriver;
    private int amount;

    public Ride() {}

    public void setCustomer(Customer c) {
        this.customer = c;
    }

    public void setCabDriver(CabDriver d) {
        this.cabdriver = d;
    }
}
