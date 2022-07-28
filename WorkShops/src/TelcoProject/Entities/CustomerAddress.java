package TelcoProject.Entities;

public class CustomerAddress {
    public CustomerAddress(int id, Customer customer, Address address) {
        this.id = id;
        this.customer = customer;
        this.address = address;
    }

    private int id;
    private Customer customer;
    private Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
