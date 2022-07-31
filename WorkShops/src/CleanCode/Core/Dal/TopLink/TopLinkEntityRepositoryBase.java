package CleanCode.Core.Dal.TopLink;

import CleanCode.Core.Dal.EntityRepository;

import java.util.ArrayList;
import java.util.List;
public class TopLinkEntityRepositoryBase<T> implements EntityRepository<T> {
    List<T> lists;
    public TopLinkEntityRepositoryBase() {
        lists = new ArrayList<T>();
    }

    @Override
    public void Add(T entity) {
        lists.add(entity);
        System.out.println("Added successfully by Hibernate ORM");
    }

    @Override
    public void Update(T entity) {

        lists.remove(entity);
        lists.add(entity);
        System.out.println("Updated successfully by Hibernate ORM");
    }

    @Override
    public void Delete(T entity) {
        lists.remove(entity);
        System.out.println("Deleted successfully by Hibernate ORM");
    }

    @Override
    public List<T> GetAll() {
        System.out.println("Listed successfully by Hibernate ORM");
        return lists;
    }

    @Override
    public T Get(T entity) {
        System.out.println("Listed successfully by Hibernate ORM");
        if ( lists.contains(entity))
            return entity;
        else
            return null;
    }
}
