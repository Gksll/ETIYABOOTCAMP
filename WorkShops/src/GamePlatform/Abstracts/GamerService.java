package GamePlatform.Abstracts;

import GamePlatform.Entities.Gamer;

import java.util.List;

public interface GamerService extends BaseRepository<Gamer>{
Gamer get(int id);
List<Gamer> getAll();
}
