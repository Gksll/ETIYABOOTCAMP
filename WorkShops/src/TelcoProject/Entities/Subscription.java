package TelcoProject.Entities;

import TelcoProject.Entities.Customer;

import java.util.Date;

public class Subscription {
    public Subscription(int id, Customer customer, Service service, Address address, Date startingDate, Date endingDate) {
        this.id = id;
        this.customer = customer;
        this.service = service;
        this.address = address;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
    }

    private int id;
    private Customer customer;
    private Service service;
    private Address address;
    private Date startingDate;
    private Date endingDate;

    public Subscription(int id, Customer customer1, Service service1, Address address1, java.sql.Date startingDate, java.sql.Date endingDate) {
    }

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


    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public Date getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
    }
}
