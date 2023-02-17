package week7.storm;

public class StormWarningV2 {
    //instance variables
    private String stormType;
    private int windSpeedInMPH;

    //constructor
    public StormWarningV2(String storm, int speed) {
        stormType = storm;
        windSpeedInMPH = speed;
    }

    //other methods
    public double predictDamageLevel() {

        if (stormType.equals("hurricane")) {
            Hurricane st = new Hurricane(windSpeedInMPH);
            return st.predictDamageInDollars();
        } else if (stormType.equals("tornado")) {
            Tornado st = new Tornado(windSpeedInMPH);
            return st.predictDamageInDollars();
        } else if (stormType.equals("thunderstorm")) {
            ThunderStorm st = new ThunderStorm(windSpeedInMPH);
            return st.predictDamageInDollars();
        }
        return 0;
    }

    //toString
    public String toString() {
        return "The " + stormType + " with wind speeds of " + windSpeedInMPH + "MPH may have damages of " + predictDamageLevel();
    }

}
