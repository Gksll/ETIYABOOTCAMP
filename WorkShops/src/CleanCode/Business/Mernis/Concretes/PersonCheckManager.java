package CleanCode.Business.Mernis.Concretes;

import CleanCode.Business.Mernis.Abstracts.PersonCheckService;
import CleanCode.Core.Utilities.MernisAdapter.MernisServiceAdapter;
import CleanCode.Core.Utilities.Results.Result;
import CleanCode.Entities.Concretes.Person;

public class PersonCheckManager implements PersonCheckService {
    private MernisServiceAdapter adapter;

    public PersonCheckManager(MernisServiceAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public Result CheckIfRealPerson(Person entity) throws Exception {
        return new Result(adapter.CheckIfRealPerson(entity));
    }
}
