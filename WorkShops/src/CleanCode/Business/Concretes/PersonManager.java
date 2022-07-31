package CleanCode.Business.Concretes;

import CleanCode.Business.Abstracts.PersonService;
import CleanCode.Business.Mernis.Abstracts.CheckService;
import CleanCode.Core.Utilities.Results.*;
import CleanCode.DataAccessLayer.Abstracts.PersonDalService;
import CleanCode.Entities.Concretes.Person;

import java.util.List;

public class PersonManager implements PersonService {
     PersonDalService personDalService;
    private CheckService<Person> personCheckService;

    public PersonManager(PersonDalService personDalService, CheckService<Person> personCheckService) {
        this.personDalService = personDalService;
        this.personCheckService = personCheckService;
    }

    @Override
    public Result Add(Person entity) throws Exception {
        if (personCheckService.CheckIfRealPerson(entity).isSuccess()){
        personDalService.Add(entity);
        return new SuccessResult();}
        else
            return new ErrorResult();
    }

    @Override
    public Result Delete(Person entity) {
        personDalService.Delete(entity);
        return new SuccessResult();
    }

    @Override
    public Result Update(Person entity) throws Exception {
        if (personCheckService.CheckIfRealPerson(entity).isSuccess()){
            personDalService.Update(entity);
            return new SuccessResult();}
        else
            return new ErrorResult();
    }

    @Override
    public DataResult<List<Person>> GetAll() {
        personDalService.GetAll();
        return new SuccessDataResult<List<Person>>();
    }

    @Override
    public DataResult<Person> FindById(Person entity) {
        personDalService.Get(entity);
        return new SuccessDataResult<Person>();
    }


    @Override
    public Result checkIfPersonExists(Person person) throws Exception {
      return new Result(personCheckService.CheckIfRealPerson(person).isSuccess());
    }
}
