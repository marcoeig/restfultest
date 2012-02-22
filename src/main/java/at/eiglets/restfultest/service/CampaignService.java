package at.eiglets.restfultest.service;

import org.joda.time.DateMidnight;
import org.springframework.stereotype.Service;

import at.eiglets.restfultest.domain.Campaign;

@Service
public class CampaignService {

	public Campaign findById(int id) {
		final Campaign campaign = new Campaign();
		campaign.setName("Testkampagne");
		campaign.setFrom(new DateMidnight());
		campaign.setUntil(new DateMidnight());
		campaign.setBudgetTotal(100);
		return campaign;
	}
	
	
}
