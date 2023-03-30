package week11.setsMaps;

public class TryHashFunctions {

    public static int simpleHashCode(String str) {
        int h = 0;
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " " + (int)str.charAt(i));
            h += str.charAt(i);
        }
        return h;
    }

    public static int betterHashCode(String str) {
        final int HASH_MULTIPLIER = 31;
        int h = 0;
        for (int i = 0; i < str.length(); i ++) {
            h = HASH_MULTIPLIER * h + str.charAt(i);
        }
        return h;
    }

    public static void main(String[] args) {
        System.out.println("Simple hash for eat "  + simpleHashCode("eat"));
        System.out.println("Simple hash for tea "  + simpleHashCode("tea"));
//
        System.out.println("Better hash for eat " + betterHashCode("eat"));
        System.out.println("Better hash for tea " + betterHashCode("tea"));
    }
}
