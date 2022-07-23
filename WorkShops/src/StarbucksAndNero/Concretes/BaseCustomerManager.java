package StarbucksAndNero.Concretes;

import StarbucksAndNero.Abstracts.CustomerService;
import StarbucksAndNero.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {
    @Override
    public void Save(Customer customer) {
    }
}
