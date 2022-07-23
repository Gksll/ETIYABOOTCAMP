package GamePlatform.Concretes;

import GamePlatform.Entities.Gamer;
import GamePlatform.Mernis.SBGKPSPublicSoap;

public class MernisAdapter {
    SBGKPSPublicSoap adapter = new SBGKPSPublicSoap();

    public boolean checkIfRealPerson(Gamer gamer) throws Exception {
        boolean result = adapter.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getFirstName(), gamer.getLastName(), gamer.getDateOfBirth());
        return result;
    }
}
