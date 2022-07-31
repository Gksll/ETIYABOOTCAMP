package CleanCode.Core.Utilities.MernisAdapter;

import CleanCode.Core.MernisReferance.VDUKPSPublicSoap;
import CleanCode.Entities.Abstract.PersonEntityService;
import CleanCode.Entities.Concretes.Person;

public class MernisServiceAdapter {

    public boolean CheckIfRealPerson(Person personToCheck) throws Exception {
        VDUKPSPublicSoap client = new VDUKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.parseLong(personToCheck.getIdentityNumber()),personToCheck.getFirstName(),personToCheck.getLastName(),personToCheck.getBirthYear());
    }

}
