package GamePlatform.Concretes;

import GamePlatform.Abstracts.GameService;
import GamePlatform.Entities.Campaign;
import GamePlatform.Entities.Game;
import GamePlatform.Entities.Gamer;

import java.util.ArrayList;
import java.util.List;

public class GameManager implements GameService {
    List<Game> games;
    List<Game> soldGames;

    public GameManager() {
        games = new ArrayList<Game>();
        soldGames = new ArrayList<Game>();
    }

    @Override
    public void add(Game item) throws Exception {
        games.add(item);
        System.out.println("added successfully");
    }

    @Override
    public void update(Game item) {
        System.out.println("updated successfully");
    }

    @Override
    public void delete(Game item) {
        games.remove(item);
    }

    @Override
    public void sell(Game game, Gamer gamer) {
        games.remove(game);
        soldGames.add(game);
        System.out.println(" sold by " + gamer.getFirstName());
    }

    public void sell(Game game, Gamer gamer, Campaign campaign) {
        System.out.println("Before Campaign: " + game.getPrice());
        game.setPrice(game.getPrice() - (game.getPrice() * (campaign.getDiscontinued())));
        games.remove(game);
        soldGames.add(game);
        System.out.println(" sold by " + gamer.getFirstName() + " / After Campaign Price: " + game.getPrice());
    }

    public void getAll() {
        for (Game item : games) {
            System.out.println("Available Games" + item.getName());
        }
        for (Game item : soldGames) {
            System.out.println("Sold already: " + item.getName());
        }
    }
}
