package week7.storm;

public class StormWarning {
	//instance variables
	private String stormType;
	private int windSpeedInMPH;
	
	//Constants
	public final static double PREDICTED_DAMAGE_LEVEL_0 = 1000;
	public final static double PREDICTED_DAMAGE_LEVEL_1 = 5000;
	public final static double PREDICTED_DAMAGE_LEVEL_2 = 100000;
	public final static double PREDICTED_DAMAGE_LEVEL_3 = 500000;
	public final static double PREDICTED_DAMAGE_LEVEL_4 = 1000000;
	public final static int BAD_HURRICANE_CUTOFF = 130;
	public final static int BAD_TORNADO_CUTOFF = 157;
	public final static int BAD_THUNDERSTORM_CUTOFF = 60;
	
	//constructor
	public StormWarning(String storm, int speed) {
		stormType = storm;
		windSpeedInMPH = speed;
	}
	
	//other methods
	public double predictDamageLevel() {
		double damageLevel = 0;
		if (stormType.equals("hurricane")) {
			if (windSpeedInMPH <= BAD_HURRICANE_CUTOFF) {
				damageLevel = PREDICTED_DAMAGE_LEVEL_3 + 15;
			} else {
				damageLevel = PREDICTED_DAMAGE_LEVEL_4 - 20;
			}
		} else if (stormType.equals("tornado")) {
		    if (windSpeedInMPH <= BAD_TORNADO_CUTOFF) {
				damageLevel = PREDICTED_DAMAGE_LEVEL_2 *1.2;
			} else {
				damageLevel = PREDICTED_DAMAGE_LEVEL_3 * 1.3;
			}
		} else if (stormType.equals("thunderstorm")) {
			if (windSpeedInMPH <= BAD_THUNDERSTORM_CUTOFF) {
				damageLevel = PREDICTED_DAMAGE_LEVEL_0 / 2;
			} else {
				damageLevel = PREDICTED_DAMAGE_LEVEL_1 / 2.5;
			}
		}
		return damageLevel;
	}
	
	//toString
	public String toString() {
		return "The " + stormType + " with wind speeds of " + windSpeedInMPH + "MPH may have damages of " + predictDamageLevel();
	}
	 


}
