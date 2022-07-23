package GamePlatform.Abstracts;

import GamePlatform.Entities.Game;
import GamePlatform.Entities.Gamer;

public interface GameService extends BaseRepository<Game>{
    void sell(Game game, Gamer gamer);
}
