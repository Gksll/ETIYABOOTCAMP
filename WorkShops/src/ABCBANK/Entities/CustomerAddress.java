package ABCBANK.Entities;

public class CustomerAddress {
    public CustomerAddress(int id,Customer customer, Address address) {
        this.id=id;
        this.customerId = customer.getId();
        this.addressId = address.getId();
    }
    private int id;
    private int customerId;
    private int addressId;

    public CustomerAddress(int id, TelcoProject.Entities.Customer customer1, TelcoProject.Entities.Address address1) {
    }

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
