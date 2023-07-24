package com.api.genshinimpact;

import com.api.genshinimpact.arm.*;
import com.api.genshinimpact.repository.*;
import com.api.genshinimpact.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GenshinImpactApplication implements CommandLineRunner {

	// ------------------- SERVICE ---------------------
	private CrudUpdatesService updatesService;
	public GenshinImpactApplication(CrudUpdatesService updatesService){
		this.updatesService = updatesService;
	}

	private CrudAchievementsService achievementsService;
	public GenshinImpactApplication(CrudAchievementsService achievementsService){
		this.achievementsService = achievementsService;
	}

	private CrudCharactersService charactersService;

	public GenshinImpactApplication(CrudCharactersService charactersService){
		this.charactersService = charactersService;
	}

	private CrudFishingService fishingService;
	public GenshinImpactApplication(CrudFishingService fishingService){
		this.fishingService = fishingService;
	}

	private CrudFoodService foodService;
	public GenshinImpactApplication(CrudFoodService foodService){
		this.foodService = foodService;
	}
	private CrudPlayerService playerService;
	public GenshinImpactApplication(CrudPlayerService playerService) {
		this.playerService = playerService;
	}
	private CrudPotionsService potionsService;
	public GenshinImpactApplication(CrudPotionsService potionsService){
		this.potionsService = potionsService;
	}
	private CrudQuestsService questsService;
	public GenshinImpactApplication(CrudQuestsService questsService){
		this.questsService = questsService;
	}
	private CrudStatisticCharactersService statisticCharactersService;
	public GenshinImpactApplication(CrudStatisticCharactersService statisticCharactersService){
		this.statisticCharactersService = statisticCharactersService;
	}
	private CrudWeaponsService weaponsService;
	public GenshinImpactApplication(CrudWeaponsService weaponsService){
		this.weaponsService = weaponsService;
	}
	public static void main(String[] args) {
		SpringApplication.run(GenshinImpactApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.achievementsService.insertData(); //INSERT DATA ON DATABASE -> ACHIEVEMENTS
		this.charactersService.insertData(); //INSERT DATA ON DATABASE -> CHARACTERS
		this.fishingService.insertData(); //INSERT DATA ON DATABASE -> FISHING
		this.foodService.insertData(); //INSERT DATA ON DATABASE -> FOOD
		this.playerService.insertData(); //INSERT DATA ON DATABASE -> PLAYER
		this.potionsService.insertData(); //INSERT DATA ON DATABASE -> POTIONS
		this.questsService.insertData(); //INSERT DATA ON DATABASE -> QUESTS
		this.statisticCharactersService.insertData(); //INSERT DATA ON DATABASE -> STATISTIC CHARACTERS
		this.updatesService.insertData(); //INSERT DATA ON DATABASE -> UPDATES
		this.weaponsService.insertData(); //INSERT DATA ON DATABASE -> WEAPONS
	}
}
