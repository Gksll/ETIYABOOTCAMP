package CleanCode.Business.Abstracts;

import CleanCode.Core.Utilities.Results.Result;
import CleanCode.Entities.Concretes.Customer;

public interface CustomerService extends MethodService<Customer>{
    Result checkIfCustomerExists(Customer customer) throws Exception;
}
