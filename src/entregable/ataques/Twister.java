package entregable.ataques;

import game.components.Monster;
import game.random.RandomGenerator;

public class Twister implements Swirl{

	@Override
	public int damage(Monster monster) {
		return RandomGenerator.getInstance().calculateDamage(100, 200);
	}
	
	
	
	
}
