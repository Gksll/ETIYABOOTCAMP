package GamePlatform.Concretes;

import GamePlatform.Abstracts.GamerService;
import GamePlatform.Entities.Gamer;

import java.util.ArrayList;
import java.util.List;

public class GamerManager implements GamerService {
    private MernisAdapter adapter;

    public GamerManager(MernisAdapter adapter) {
        this.adapter = adapter;
    }

    List<Gamer> gamersList = new ArrayList<Gamer>();

    @Override
    public void add(Gamer item) throws Exception {
        checkPerson(item);
        gamersList.add(item);
        System.out.println("added successfully");
    }

    @Override
    public void update(Gamer item) {
        System.out.println("Updated successfully");

    }

    @Override
    public void delete(Gamer item) {
        gamersList.remove(item);
        System.out.println("deleted successfully");
    }

    @Override
    public Gamer get(int id) {
        Gamer gamerTmp = new Gamer();
        for (Gamer item : gamersList) {
            if (item.getId() == id) {
                gamerTmp = item;
            }
            System.out.println("listed successfully " + gamerTmp.getFirstName());
            return gamerTmp;
        }
        System.out.println("warning, check the id!");
        return null;
    }

    @Override
    public List<Gamer> getAll() {
        for (Gamer gamer : gamersList) {
            System.out.println(gamer.getFirstName());
        }
        return gamersList;
    }

    private boolean checkPerson(Gamer gamer) throws Exception {
        return adapter.checkIfRealPerson(gamer);
    }
}
