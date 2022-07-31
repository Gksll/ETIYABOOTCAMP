package CleanCode;

import CleanCode.Business.Abstracts.CustomerService;
import CleanCode.Business.Abstracts.MethodService;
import CleanCode.Business.Abstracts.PersonService;
import CleanCode.Business.Concretes.CustomerManager;
import CleanCode.Business.Concretes.PersonManager;
import CleanCode.Business.Mernis.Concretes.CustomerCheckManager;
import CleanCode.Business.Mernis.Concretes.PersonCheckManager;
import CleanCode.Core.Utilities.MernisAdapter.MernisServiceAdapter;
import CleanCode.DataAccessLayer.Abstracts.PersonDalService;
import CleanCode.DataAccessLayer.Concretes.HNCustomerDal;
import CleanCode.DataAccessLayer.Concretes.HNPersonDal;
import CleanCode.Entities.Abstract.PersonEntityService;
import CleanCode.Entities.Concretes.Customer;
import CleanCode.Entities.Concretes.Person;

public class Main {
    public static void main(String[] args) throws Exception {
        PersonEntityService person = new Person(1994,"göksel","doğan","21040181962");

        PersonService personManager = new PersonManager( new HNPersonDal(),new PersonCheckManager(new MernisServiceAdapter()));
        personManager.checkIfPersonExists((Person) person);
        personManager.Add((Person) person);
        personManager.Update((Person) person);
        personManager.Delete((Person) person);
        personManager.FindById((Person) person);
        personManager.GetAll();

        PersonEntityService customer = new Customer((Person) person,"Eskişehir");
        CustomerService customerManager = new CustomerManager(new HNCustomerDal(),new CustomerCheckManager(new MernisServiceAdapter()));
        customerManager.Add((Customer) customer);
        customerManager.Update((Customer) customer);
        customerManager.Delete((Customer) customer);
        customerManager.FindById((Customer) customer);
        customerManager.GetAll();


    }
}
