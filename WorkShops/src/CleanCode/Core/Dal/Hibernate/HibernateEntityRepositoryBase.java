package CleanCode.Core.Dal.Hibernate;

import CleanCode.Core.Dal.EntityRepository;
import CleanCode.Entities.Abstract.PersonEntityService;

import java.util.ArrayList;
import java.util.List;

public class HibernateEntityRepositoryBase<T> implements EntityRepository<T> {
    List<T> lists;

    public HibernateEntityRepositoryBase() {
        lists = new ArrayList<T>();
    }

    @Override
    public void Add(T entity) {
        lists.add(entity);
        System.out.println(entity.getClass().getSimpleName()+" Added successfully by Hibernate ORM");
    }

    @Override
    public void Update(T entity) {

        lists.remove(entity);
        lists.add(entity);
        System.out.println(entity.getClass().getSimpleName()+" Updated successfully by Hibernate ORM");
    }

    @Override
    public void Delete(T entity) {
        lists.remove(entity);
        System.out.println(entity.getClass().getSimpleName()+" Deleted successfully by Hibernate ORM");
    }

    @Override
    public List<T> GetAll() {
        System.out.println(lists.getClass().getSimpleName()+" Listed successfully by Hibernate ORM");
        return lists;
    }

    @Override
    public T Get(T entity) {
        System.out.println(entity.getClass().getSimpleName()+" Listed successfully by Hibernate ORM");
        if ( lists.contains(entity))
        return entity;
         else
             return null;
    }
}
