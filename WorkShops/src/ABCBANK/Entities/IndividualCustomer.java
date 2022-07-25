package ABCBANK.Entities;

public class IndividualCustomer extends Customer{
    public IndividualCustomer(Channel channel) {
        super(channel);
    }

    private String firstName;
    private String lastName;
    private String identityNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }
}
