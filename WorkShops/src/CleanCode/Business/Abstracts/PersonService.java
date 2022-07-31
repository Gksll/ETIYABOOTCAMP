package CleanCode.Business.Abstracts;

import CleanCode.Core.Utilities.Results.Result;
import CleanCode.Entities.Concretes.Customer;
import CleanCode.Entities.Concretes.Person;

public interface PersonService extends MethodService<Person>{
    Result checkIfPersonExists(Person person) throws Exception;
}
