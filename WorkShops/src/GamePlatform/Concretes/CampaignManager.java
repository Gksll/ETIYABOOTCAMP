package GamePlatform.Concretes;

import GamePlatform.Abstracts.CampaignService;
import GamePlatform.Entities.Campaign;

import java.util.ArrayList;
import java.util.List;

public class CampaignManager implements CampaignService {
    List<Campaign> campaigns;

    public CampaignManager() {
        campaigns = new ArrayList<Campaign>();
    }

    @Override
    public void add(Campaign item) throws Exception {
    campaigns.add(item);
        System.out.println("Added successfully");
    }

    @Override
    public void update(Campaign item) {
        Campaign tmpItem=item;
        for (Campaign campaign:campaigns) {
            if (item.getId()==campaign.getId())
                campaigns.remove(item);
        }
        campaigns.add(tmpItem);
        System.out.println("updated successfully");
    }

    @Override
    public void delete(Campaign item) {
        campaigns.remove(item);
        System.out.println("deleted successfully");
    }
}
