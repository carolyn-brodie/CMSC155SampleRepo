package week11.setsMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UseMap {
    public static String findMaxInMap(Map<String,Integer> theMap) {
        Iterator it = theMap.entrySet().iterator();
        int max;
        String keyForMaxValue = null;
        Map.Entry pair;
        //Start at beginning
        if (it.hasNext()) {
            pair = (Map.Entry) it.next();
            keyForMaxValue = (String) pair.getKey();
            max = (int)pair.getValue();
            while (it.hasNext()) {
                pair = (Map.Entry) it.next();
                if ((int)pair.getValue() > max) {
                    keyForMaxValue = (String) pair.getKey();
                    max = (int)pair.getValue();
                }
            }
        }
        return keyForMaxValue;
    }

    public static void main(String[] args) {
        Map<String, Integer> test = new HashMap<>();
        test.put("A",1);
        test.put("B",5);

        test.put("A",2);
        test.put("C",3);
        test.put("D", 1);
        test.put("E",4);
        System.out.println(test);
        System.out.println(findMaxInMap(test));
    }
}
