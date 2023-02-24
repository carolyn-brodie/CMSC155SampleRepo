package week7.storm;

public class Tornado implements StormType{



    //instance variables
    private int windSpeed;

    //constructor
    public Tornado (int wind) {
        windSpeed = wind;
    }

    //other methods
    public double predictDamageInDollars() {
        double damageLevel = 0;
        if (windSpeed <= BAD_TORNADO_CUTOFF) {
            damageLevel = PREDICTED_DAMAGE_LEVEL_2 *1.2;
        } else {
            damageLevel = PREDICTED_DAMAGE_LEVEL_3 * 1.3;
        }
        return damageLevel;
    }

    //toString
    public String toString() {
        return "Tornado with wind speeds of " + windSpeed;
    }

}
