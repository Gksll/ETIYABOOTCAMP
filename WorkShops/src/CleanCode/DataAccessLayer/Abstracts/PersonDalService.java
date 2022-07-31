package CleanCode.DataAccessLayer.Abstracts;

import CleanCode.Core.Dal.EntityRepository;
import CleanCode.Entities.Concretes.Person;

public interface PersonDalService extends EntityRepository<Person> {
}
