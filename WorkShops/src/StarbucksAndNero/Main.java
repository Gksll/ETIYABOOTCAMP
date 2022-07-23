package StarbucksAndNero;

import StarbucksAndNero.Abstracts.CustomerService;
import StarbucksAndNero.Concretes.NeroCustomerManager;
import StarbucksAndNero.Concretes.StarbucksCustomerManager;
import StarbucksAndNero.Entities.Customer;
import StarbucksAndNero.MernisReferance.VDUKPSPublicSoap;

public class Main {
    public static void main(String[] args) throws Exception {
        Customer goksel = new Customer();
        goksel.setFirstName("Göksel");
        goksel.setLastName("Doğan");
        goksel.setDateOfBirth(1994);
        goksel.setNationalityId("41010181261");

        CustomerService neroCustomer = new NeroCustomerManager();
        neroCustomer.Save(goksel);
        CustomerService starCustomer = new StarbucksCustomerManager();
        if (((StarbucksCustomerManager) starCustomer).checkIfPersonReal(goksel)) {
            starCustomer.Save(goksel);
        } else {
            System.out.println("Check personel information!");
        }
    }

}
