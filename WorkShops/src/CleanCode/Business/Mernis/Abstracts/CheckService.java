package CleanCode.Business.Mernis.Abstracts;

import CleanCode.Core.Utilities.Results.Result;

public interface CheckService <T>{
    Result CheckIfRealPerson(T entity) throws Exception;
}
