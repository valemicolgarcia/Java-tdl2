package entregable.ataques;

import game.attacks.Attack;
import game.components.Monster;
import game.random.RandomGenerator;

public class Knife implements Weapon {

	@Override
	public int damage(Monster monster) {
		if (monster.getLife() < 100) {
			return (monster.getLife() - 10);
		} else {
			int damage = RandomGenerator.getInstance().calculateDamage(50, 100);
			return damage;
		}

	}

}
