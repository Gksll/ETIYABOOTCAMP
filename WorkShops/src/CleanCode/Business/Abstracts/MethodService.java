package CleanCode.Business.Abstracts;

import CleanCode.Core.Utilities.Results.DataResult;
import CleanCode.Core.Utilities.Results.Result;

import java.util.List;

public interface MethodService<T>
{
    Result Add(T entity) throws Exception;
    Result Delete(T entity);
    Result Update(T entity) throws Exception;
    DataResult<List<T>> GetAll();
    DataResult<T> FindById(T entity);
}
