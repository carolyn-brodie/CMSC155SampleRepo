package week11.setsMaps;

/**
 * Created by Owner on 3/30/2017.
 */
import java.util.*;

public class TryMaps {

    public static void main(String[] args) {
       Map<String, Integer> test = new HashMap<>();
		test.put("A",1);
		test.put("B",2);
		System.out.println(test);

		test.put("A",2);
		test.put("C",3);
		System.out.println(test);

//
//        //System.out.println(test.get("B"));
//
//		for (String key : test.keySet())
//			System.out.println(key + " " + test.get(key));
//
//        Iterator it = test.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry pair = (Map.Entry) it.next();
//            System.out.println(pair.getKey() + " = " + pair.getValue());
//        }
////
//		test.remove("A");
////		System.out.println(test);
////
//		test.put("A", 8);
//		System.out.println(test); // order of elements not guaranteed
////
//        System.out.println(test.get("B") + test.get("C"));
////
////     System.out.println(test.get("D")); // result is null
////
//         System.out.println(test.get(2));
////     // result is null - not an error, even though 5 is the wrong key type!
////
////        System.out.println(test.get("B") + test.get("D")); // run-time error
////
//        if (test.containsKey("D")) System.out.println(test.get("D")); // no output
////
//		String key1 = "D"; // repeat above example but don't duplicate "D".
//        if (test.containsKey(key1)) System.out.println(test.get(key1)); // no output
//        String key2 = "A";
//        if (test.containsKey(key2)) System.out.println(test.get(key2));
//
//        test.remove("B");
//        System.out.println(test);
////
//		test.remove("D"); // removing a key not in the map; nothing happens.
//		System.out.println(test);
////
// //Three classes that implement the Map interface: HashMap, LinkedHashMap  TreeMap
//
//    // HashSet does not guarantee the order of elements.
//    Map<String, Integer> hashmap= new HashMap<>();
//		hashmap.put("dog", 4);
//		hashmap.put("cat", 4);
//		hashmap.put("fish", 0);
//		hashmap.put("bird", 2);
//		hashmap.put("spider", 8);
//		System.out.println(hashmap);  // Order not guaranteed
//
//		hashmap.remove("fish");
//		hashmap.put("fish", 0);
//		System.out.println(hashmap);  // Order MAY CHANGE.
////
////  //  HashLinkedMap maintains the order elements are added in.
//    Map<String, Integer> linkedHashmap = new LinkedHashMap<>();
//		linkedHashmap.put("dog", 4);
//		linkedHashmap.put("cat", 4);
//		linkedHashmap.put("fish", 0);
//		linkedHashmap.put("bird", 2);
//		linkedHashmap.put("spider", 8);
//		System.out.println(linkedHashmap);  // Elements are in same order as inserted.
//
//		linkedHashmap.remove("fish");
//		linkedHashmap.put("fish", 0);
//		System.out.println(linkedHashmap);  // Order has changed: fish is last
////
////     //TreeMap keeps the keys in sorted order (alphabetical for strings). It does so efficiently, using a binary search tree.
//    Map<String, Integer> treemap = new TreeMap<>();
//		treemap.put("dog", 4);
//		treemap.put("cat", 4);
//		treemap.put("fish", 0);
//		treemap.put("bird", 2);
//		treemap.put("spider", 8);
//		System.out.println(treemap);  // Keys are in alphabetical order.
//
//		treemap.remove("fish");
//		treemap.put("fish", 0);
//		System.out.println(treemap);  // Order has NOT changed.
    }
}
