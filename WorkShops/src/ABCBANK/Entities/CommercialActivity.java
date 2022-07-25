package ABCBANK.Entities;

import java.util.Date;

public class CommercialActivity {

    public CommercialActivity(IndividualCustomer individualCustomer) {
        this.individualCustomerId = individualCustomer.getId();
    }
    private int id;
    private int individualCustomerId;
    private Date startingDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIndividualCustomerId() {
        return individualCustomerId;
    }


    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }
}
