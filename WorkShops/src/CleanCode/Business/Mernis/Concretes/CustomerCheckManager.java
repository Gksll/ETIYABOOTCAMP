package CleanCode.Business.Mernis.Concretes;

import CleanCode.Business.Mernis.Abstracts.CustomerCheckService;
import CleanCode.Core.Utilities.MernisAdapter.MernisServiceAdapter;
import CleanCode.Core.Utilities.Results.Result;
import CleanCode.Entities.Concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService {
    private MernisServiceAdapter adapter;

    public CustomerCheckManager(MernisServiceAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public Result CheckIfRealPerson(Customer entity) throws Exception {
        return new Result(adapter.CheckIfRealPerson(entity));
    }
}
