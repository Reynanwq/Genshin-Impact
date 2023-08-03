package com.api.genshinimpact;

import com.api.genshinimpact.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GenshinImpactApplication implements CommandLineRunner {

	private final CrudUpdatesService updatesService;
	private final CrudAchievementsService achievementsService;
	private final CrudCharactersService charactersService;
	private final CrudFishingService fishingService;
	private final CrudFoodService foodService;
	private final CrudPlayerService playerService;
	private final CrudPotionsService potionsService;
	private final CrudQuestsService questsService;
	private final CrudStatisticCharactersService statisticCharactersService;
	private final CrudWeaponsService weaponsService;

	@Autowired
	public GenshinImpactApplication(
			CrudUpdatesService updatesService,
			CrudAchievementsService achievementsService,
			CrudCharactersService charactersService,
			CrudFishingService fishingService,
			CrudFoodService foodService,
			CrudPlayerService playerService,
			CrudPotionsService potionsService,
			CrudQuestsService questsService,
			CrudStatisticCharactersService statisticCharactersService,
			CrudWeaponsService weaponsService) {
		this.updatesService = updatesService;
		this.achievementsService = achievementsService;
		this.charactersService = charactersService;
		this.fishingService = fishingService;
		this.foodService = foodService;
		this.playerService = playerService;
		this.potionsService = potionsService;
		this.questsService = questsService;
		this.statisticCharactersService = statisticCharactersService;
		this.weaponsService = weaponsService;
	}

	public static void main(String[] args) {
		SpringApplication.run(GenshinImpactApplication.class, args);}


		@Override
		public void run (String...args) throws Exception {
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

/*
Com base nos logs fornecidos, parece que você está encontrando uma NullPointerException em sua aplicação Java Spring. Especificamente, o erro ocorre na classe `PlayerController`, na linha 18, ao chamar o método `findById` do campo `playerService`, que está nulo.

Para resolver esse problema, você precisa garantir que o `playerService` esteja devidamente inicializado e injetado na classe `PlayerController`. O `playerService` provavelmente deve ser um bean gerenciado pela injeção de dependência do Spring.

Aqui estão algumas etapas que você pode seguir para solucionar e corrigir o problema:

1. Verifique se o `CrudPlayerService` está devidamente definido como um bean do Spring e se está sendo injetado na classe `PlayerController`. Certifique-se de que a anotação `@Service` (ou qualquer outra anotação apropriada, como `@Component` ou `@Repository`) esteja presente na implementação do `CrudPlayerService`.

2. Certifique-se de que você configurou corretamente a varredura de componentes em sua classe principal de aplicativo para incluir o pacote onde estão localizados `CrudPlayerService` e `PlayerController`. Por exemplo, se a sua classe principal de aplicativo for chamada `GenshinImpactApplication`, ela deve ser anotada com `@SpringBootApplication(scanBasePackages = "com.api.genshinimpact")` (ou o pacote apropriado).

3. Verifique se há configurações ou perfis condicionais que possam impedir a criação e injeção do `CrudPlayerService`.

4. Verifique se o `CrudPlayerService` não está sendo instanciado manualmente (ou seja, usando a palavra-chave `new`) na classe `PlayerController`. Em vez disso, deixe o Spring cuidar da injeção de dependência.

5. Se você estiver usando injeção pelo construtor, verifique se o construtor na classe `PlayerController` está corretamente definido para receber o `CrudPlayerService` como parâmetro.

6. Verifique se há dependências circulares entre beans, pois elas podem causar problemas de inicialização.

Após fazer as correções necessárias, tente reiniciar sua aplicação e enviar a requisição GET novamente para ver se o problema foi resolvido.

Lembre-se de que, sem ver o código da classe `PlayerController` e `CrudPlayerService`, é difícil identificar o problema exato. No entanto, essas etapas gerais de solução de problemas devem ajudar a identificar e corrigir a NullPointerException em sua aplicação Spring.

*/
