package ABCBANK.Entities;

import java.util.Date;

public class BalanceSheet {
    public BalanceSheet(Customer customer) {
        this.customerId = customer.getId();
    }

    private int id;
    private int customerId;
    private Date date;
    private double totalPrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
