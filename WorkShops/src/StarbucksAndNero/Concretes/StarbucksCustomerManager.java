package StarbucksAndNero.Concretes;

import StarbucksAndNero.Entities.Customer;
import StarbucksAndNero.MernisReferance.VDUKPSPublicSoap;

public class StarbucksCustomerManager extends BaseCustomerManager{
public VDUKPSPublicSoap mernisService;
    public StarbucksCustomerManager(VDUKPSPublicSoap service) {

        mernisService=service;
    }

    @Override
    public void Save(Customer customer) {
        super.Save(customer);
        System.out.println("saved to Starbucks DB " +customer.getFirstName());
    }

    public boolean checkIfPersonReal(Customer customer) throws Exception {
        boolean result= mernisService.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName(),customer.getLastName(), customer.getDateOfBirth());
    return result;
    }
}
