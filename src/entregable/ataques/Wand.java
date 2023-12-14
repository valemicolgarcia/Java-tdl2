package entregable.ataques;

import game.components.Monster;
import game.types.Type;

public class Wand implements Magic{

	@Override
	public int damage(Monster monster) {
		if (monster.getTypes().contains(Type.LOVE)) {
			return (monster.getLife() / 2);
		} else {
			return 10;
		}

	}

}
