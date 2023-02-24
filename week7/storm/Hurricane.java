package week7.storm;

public class Hurricane implements StormType{




    private int windSpeed;

    public Hurricane(int speed)  {

        windSpeed = speed;
    }

    public double predictDamageInDollars() {
        double damage = 0;

        if (windSpeed <= BAD_HURRICANE_CUTOFF) {
            damage = PREDICTED_DAMAGE_LEVEL_3 + 15;
        } else {
            damage = PREDICTED_DAMAGE_LEVEL_4 - 20;
        }

        return damage;
    }

    public String toString() {

        return "Hurricane with wind speeds of " + windSpeed + " MPH";

    }
}
