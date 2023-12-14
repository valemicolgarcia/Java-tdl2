package game.random;

public class RandomGenerator {

    private static RandomGenerator instance = new RandomGenerator();

    public static RandomGenerator getInstance() {
        return instance;
    }

    private RandomGenerator() {

    }

    public int nextPlayer() {
        double random = Math.random();
        return (random > 0.5f)? 1 : 2;
    }

    /** Retorna un valor aleatorio que se encuentra entre los valores minimos y maximos pasados
     * como parametro.
     * */
    public int calculateDamage(int min, int max) {
        return (int)(Math.random() * (max - min) + min);
    }
    
    public int obtenerComparador () {
    	
    	double random =(Math.random());
    	if (random <= 0.5) {
    		return 0;
    	} else {
    		return 1;
    	}
    }
    
    
    
    
}
