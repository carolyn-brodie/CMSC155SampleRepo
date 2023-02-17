package week7.storm;

public class ThunderStorm {
    public final static double PREDICTED_DAMAGE_LEVEL_0 = 1000;
    public final static double PREDICTED_DAMAGE_LEVEL_1 = 5000;
    public final static int BAD_THUNDERSTORM_CUTOFF = 60;

	private int windSpeed;

	public ThunderStorm(int speed) {

		windSpeed = speed;
	}

	public double predictDamageInDollars() {
		double damage = 0;

		if (windSpeed <= BAD_THUNDERSTORM_CUTOFF) {
			damage = PREDICTED_DAMAGE_LEVEL_0 / 2;;
		} else {
			damage = PREDICTED_DAMAGE_LEVEL_1 / 2.5;
		}

		return damage;
	}

	public String toString() {

		return "Thunderstorm with wind speeds of " + windSpeed + " MPH";

	}

}
