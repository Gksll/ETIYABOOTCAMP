package CleanCode.Entities.Concretes;

import CleanCode.Entities.Abstract.PersonEntityService;

public class Person implements PersonEntityService {
    private Integer birthYear;
    private String firstName;
    private String lastName;
    private String identityNumber;

    public Person() {
    }

    public Person(int birthYear, String firstName, String lastName, String identityNumber) {
        this.birthYear = birthYear;
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityNumber = identityNumber;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

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
