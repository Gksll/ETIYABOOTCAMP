package ABCBANK.Entities;

public class CustomerAddress {
    public CustomerAddress(Customer customer, Address address) {
        this.customerId = customer.getId();
        this.addressId = address.getId();
    }
    private int id;
    private int customerId;
    private int addressId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getAddressId() {
        return addressId;
    }

}
