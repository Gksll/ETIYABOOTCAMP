package CleanCode.Entities.Concretes;

public class Customer extends Person{
    private String cityName;

    public Customer(String cityName) {
        this.cityName = cityName;
    }

    public Customer(Person person,String cityName) {
        super(person.getBirthYear(), person.getFirstName(), person.getLastName(), person.getIdentityNumber());
        this.cityName = cityName;
    }

    public Customer(Integer birthYear, String firstName, String lastName, String identityNumber, String cityName) {
        super(birthYear, firstName, lastName, identityNumber);
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
