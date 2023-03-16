package week7.storm;

public class Blizzard  implements StormType {
    private int windSpeed;

    public Blizzard(int speed) {

        windSpeed = speed;
    }

    public double predictDamageInDollars() {
        double damage = 0;

        if (windSpeed <= BAD_BLIZZARD_CUTOFF) {
            damage = PREDICTED_DAMAGE_LEVEL_1 + 15;
        } else {
            damage = PREDICTED_DAMAGE_LEVEL_2 - 20;
        }

        return damage;
    }

    public String toString() {
        return "Blizzard with windspeed " + windSpeed;
    }
}
