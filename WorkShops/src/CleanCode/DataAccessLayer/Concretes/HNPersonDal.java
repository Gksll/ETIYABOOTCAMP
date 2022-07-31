package CleanCode.DataAccessLayer.Concretes;

import CleanCode.Core.Dal.Hibernate.HibernateEntityRepositoryBase;
import CleanCode.DataAccessLayer.Abstracts.PersonDalService;
import CleanCode.Entities.Concretes.Person;

public class HNPersonDal extends HibernateEntityRepositoryBase<Person> implements PersonDalService {
}
