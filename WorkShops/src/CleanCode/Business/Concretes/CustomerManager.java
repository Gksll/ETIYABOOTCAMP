package CleanCode.Business.Concretes;

import CleanCode.Business.Abstracts.CustomerService;
import CleanCode.Business.Abstracts.PersonService;
import CleanCode.Business.Mernis.Abstracts.CheckService;
import CleanCode.Core.Utilities.Results.*;
import CleanCode.DataAccessLayer.Abstracts.CustomerDalService;
import CleanCode.DataAccessLayer.Abstracts.PersonDalService;
import CleanCode.Entities.Concretes.Customer;
import CleanCode.Entities.Concretes.Person;

import java.util.List;

public class CustomerManager implements CustomerService {

    private CustomerDalService customerDalService;
    private CheckService<Customer> customerCheckService;

    public CustomerManager(CustomerDalService customerDalService, CheckService<Customer> customerCheckService) {
        this.customerDalService = customerDalService;
        this.customerCheckService = customerCheckService;
    }

    @Override
    public Result checkIfCustomerExists(Customer customer) throws Exception {
        return new Result(customerCheckService.CheckIfRealPerson(customer).isSuccess());
    }

    @Override
    public Result Add(Customer entity) throws Exception {
        if (customerCheckService.CheckIfRealPerson(entity).isSuccess()){
            customerDalService.Add(entity);
            return new SuccessResult();}
        else
            return new ErrorResult();
    }

    @Override
    public Result Delete(Customer entity) {
        customerDalService.Delete(entity);
        return new SuccessResult();
    }

    @Override
    public Result Update(Customer entity) throws Exception {
        if (customerCheckService.CheckIfRealPerson(entity).isSuccess()){
            customerDalService.Update(entity);
            return new SuccessResult();}
        else
            return new ErrorResult();
    }

    @Override
    public DataResult<List<Customer>> GetAll() {
        customerDalService.GetAll();
        return new SuccessDataResult<List<Customer>>();
    }

    @Override
    public DataResult<Customer> FindById(Customer entity) {

        customerDalService.Get(entity);
        return new SuccessDataResult<Customer>();
    }


}
