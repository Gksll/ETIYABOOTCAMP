package TelcoProject.Entities;

public class Address {
    public Address(int id, AddressType addressType, String city, String country, String postalCode, String addressDetails) {
        this.id = id;
        this.addressType = addressType;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
        this.addressDetails = addressDetails;
    }

    private int id;
    private AddressType addressType;
    private String city;
    private String country;
    private String postalCode;
    private String addressDetails;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(String addressDetails) {
        this.addressDetails = addressDetails;
    }
}
