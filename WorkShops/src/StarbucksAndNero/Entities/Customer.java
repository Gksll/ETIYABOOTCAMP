package StarbucksAndNero.Entities;

import java.time.LocalDate;

public class Customer {
    private int Id;
    private String FirstName;
    private String LastName;
    private Integer DateOfBirth;
    private String NationalityId;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Integer getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Integer dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getNationalityId() {
        return NationalityId;
    }

    public void setNationalityId(String nationalityId) {
        NationalityId = nationalityId;
    }
}
