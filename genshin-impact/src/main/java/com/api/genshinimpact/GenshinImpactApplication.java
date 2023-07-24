package com.api.genshinimpact;

import com.api.genshinimpact.arm.*;
import com.api.genshinimpact.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GenshinImpactApplication implements CommandLineRunner {

	private AchievementsRepository achievementsRepository;
	private CharactersRepository charactersRepository;

	private FishingRepository fishingRepository;

	private FoodRepository foodRepository;
	private PlayerRepository playerRepository;
	private PotionsRepository potionsRepository;
	private QuestsRepository questsRepository;
	private StatisticCharacters statisticCharactersRepository;
	private UpdatesRepository updatesRepository;
	private WeaponsRepository weaponsRepository;

	public GenshinImpactApplication(AchievementsRepository achievementsRepository){
		this.achievementsRepository = achievementsRepository;
	}

	public GenshinImpactApplication(CharactersRepository charactersRepository){
		this.charactersRepository = charactersRepository;
	}

	public GenshinImpactApplication(FishingRepository fishingRepository){
		this.fishingRepository = fishingRepository;
	}
	public GenshinImpactApplication(FoodRepository foodRepository){
		this.foodRepository = foodRepository;
	}

	public GenshinImpactApplication(PlayerRepository playerRepository){
		this.playerRepository = playerRepository;
	}
	public GenshinImpactApplication(PotionsRepository potionsRepository){
		this.potionsRepository = potionsRepository;
	}
	public GenshinImpactApplication(QuestsRepository questsRepository){
		this.questsRepository = questsRepository;
	}
	public GenshinImpactApplication(StatisticCharacters statisticCharactersRepository){
		this.statisticCharactersRepository = statisticCharactersRepository;
	}
	public GenshinImpactApplication(UpdatesRepository updatesRepository){
		this.updatesRepository = updatesRepository;
	}
	public GenshinImpactApplication(WeaponsRepository weaponsRepository){
		this.weaponsRepository = weaponsRepository;
	}
	public static void main(String[] args) {
		SpringApplication.run(GenshinImpactApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//INSERT DATA ON DATABASE -> ACHIEVEMENTS
		Achievements achievements0 = new Achievements(1, "apenas_teste", "only_Teste", "DEDAED", 1, 1);
		this.achievementsRepository.save(achievements0);
		System.out.println(achievements0);

		//INSERT DATA ON DATABASE -> CHARACTERS
		Characters characters0 = new Characters();
		this.charactersRepository.save(characters0);

		//INSERT DATA ON DATABASE -> FISHING
		Fishing fishing0 = new Fishing();
		this.fishingRepository.save(fishing0);

		//INSERT DATA ON DATABASE -> FOOD
		Food food0 = new Food();
		this.foodRepository.save(food0);

		//INSERT DATA ON DATABASE -> PLAYER
		Player player0 = new Player();
		this.playerRepository.save(player0);

		//INSERT DATA ON DATABASE -> POTIONS
		Potions potions0 = new Potions();
		this.potionsRepository.save(potions0);

		//INSERT DATA ON DATABASE -> QUESTS
		Quests quests0 = new Quests();
		this.questsRepository.save(quests0);

		//INSERT DATA ON DATABASE -> STATISTICCHARACTERS
		StatisticCharacters statisticCharacters0 = StatisticCharacters();
		this.statisticCharactersRepository.save(statisticCharacters0);

		//INSERT DATA ON DATABASE -> UPDATES
		Updates updates0 = Updates();
		this.updatesRepository.save(updates0);

		//INSERT DATA ON DATABASE -> WEAPONS
		Weapons weapons0 = Weapons();
		this.weaponsRepository.save(weapons0);
	}
}
