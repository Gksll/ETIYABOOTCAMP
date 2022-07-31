package CleanCode.Core.Dal;

import java.util.List;

public interface EntityRepository <T>{
    void Add(T entity);
    void Update(T entity);
    void Delete(T entity);
    List<T> GetAll();
    T Get(T entity);
}
