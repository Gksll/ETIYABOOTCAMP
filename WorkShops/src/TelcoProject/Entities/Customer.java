package TelcoProject.Entities;

public class Customer {
    static int count=0;
    public Customer(int id, String customerNumber) {
        this.id = id;
        this.customerNumber = customerNumber;
        count++;
    }

    public Customer() {
    }

    private int id;
    private String customerNumber;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public static int getCount() {
        return count;
    }
}
