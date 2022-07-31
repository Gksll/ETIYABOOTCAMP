package CleanCode.DataAccessLayer.Concretes;

import CleanCode.Core.Dal.Hibernate.HibernateEntityRepositoryBase;
import CleanCode.DataAccessLayer.Abstracts.CustomerDalService;
import CleanCode.Entities.Concretes.Customer;

public class HNCustomerDal extends HibernateEntityRepositoryBase<Customer> implements CustomerDalService {
}
