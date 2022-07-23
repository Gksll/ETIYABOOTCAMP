package GamePlatform;

import GamePlatform.Abstracts.GameService;
import GamePlatform.Abstracts.GamerService;
import GamePlatform.Concretes.GameManager;
import GamePlatform.Concretes.GamerManager;
import GamePlatform.Concretes.MernisAdapter;
import GamePlatform.Entities.Campaign;
import GamePlatform.Entities.Game;
import GamePlatform.Entities.Gamer;

public class Main {
    public static void main(String[] args) throws Exception {
        Gamer goksel = new Gamer();
        goksel.setId(1);
        goksel.setFirstName("Göksel");
        goksel.setLastName("Doğan");
        goksel.setNationalityId("21040181962");
        goksel.setDateOfBirth(1994);

        Gamer emre = new Gamer();
        emre.setId(2);
        emre.setFirstName("Emre");
        emre.setLastName("Yılmaz");
        emre.setNationalityId("1111111111111");
        emre.setDateOfBirth(1998);

        GamerService gamerManager = new GamerManager(new MernisAdapter());
        gamerManager.add(goksel);
        gamerManager.get(1);
        gamerManager.add(emre);
        gamerManager.getAll();
        gamerManager.delete(goksel);
        gamerManager.getAll();

        Game game = new Game();
        game.setId(1);
        game.setName("Call Of Duty 2");
        game.setPrice(99.99);



        GameManager gameManager = new GameManager();
        gameManager.add(game);
        gameManager.getAll();
        gameManager.update(game);
        gameManager.delete(game);
        gameManager.getAll();


        Campaign campaign = new Campaign();
        campaign.setId(1);
        campaign.setName("Karne hediyesi!!!");
        campaign.setDiscontinued(0.15);

        gameManager.sell(game,goksel,campaign);
        gameManager.getAll();





    }
}
