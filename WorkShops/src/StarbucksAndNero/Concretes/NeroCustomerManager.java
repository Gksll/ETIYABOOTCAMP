package StarbucksAndNero.Concretes;

import StarbucksAndNero.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
    @Override
    public void Save(Customer customer) {
        super.Save(customer);
        System.out.println("saved to Nero DB " +customer.getFirstName());
    }
}
