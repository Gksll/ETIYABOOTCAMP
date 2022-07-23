package StarbucksAndNero.Concretes;

import StarbucksAndNero.Entities.Customer;
import StarbucksAndNero.MernisReferance.VDUKPSPublicSoap;

import java.time.LocalDate;

public class StarbucksCustomerManager extends BaseCustomerManager{
    @Override
    public void Save(Customer customer) {
        super.Save(customer);
        System.out.println("saved to Starbucks DB " +customer.getFirstName());
    }

    public boolean checkIfPersonReal(Customer customer) throws Exception {
        VDUKPSPublicSoap mernisService = new VDUKPSPublicSoap();
        boolean result= mernisService.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName(),customer.getLastName(), customer.getDateOfBirth());
    return result;
    }
}
