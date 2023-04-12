package week11.setsMaps;

import java.util.HashMap;
import java.util.Map;

public class MapofMaps {

    public static void main(String[] args) {
        Map<String, Integer> smallMap = new HashMap<>();
        smallMap.put("Dogs", 150);
        smallMap.put("Seals", 50);
        System.out.println(smallMap);

        Map<Map<String, Integer>, Integer> bigMap = new HashMap<>();
        bigMap.put(smallMap, 5);
        System.out.println(bigMap);
    }
}
