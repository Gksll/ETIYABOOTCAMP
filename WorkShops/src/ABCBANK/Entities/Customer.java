package ABCBANK.Entities;

public class Customer {

    public Customer(Channel channel) {
        this.channelId = channel.getId();
    }

    private int id;
    private int channelId;
    private String customerNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChannelId() {
        return channelId;
    }


    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
}
