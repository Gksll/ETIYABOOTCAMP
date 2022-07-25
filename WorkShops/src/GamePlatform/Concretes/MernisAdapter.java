package GamePlatform.Concretes;

import GamePlatform.Entities.Gamer;
import GamePlatform.Mernis.TUDKPSPublicSoap;

public class MernisAdapter {
    TUDKPSPublicSoap adapter = new TUDKPSPublicSoap();

    public boolean checkIfRealPerson(Gamer gamer) throws Exception {
        boolean result = adapter.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getFirstName(), gamer.getLastName(), gamer.getDateOfBirth());
        return result;
    }
}
