package week8;

public class Perm2 {

    public static void permutation(String str) {
        permutation("", str);
    }

    public static void permutation(String prefix, String str) {

        int n = str.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++) {
                System.out.println(prefix);
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
            }
        }
    }

    public static void main(String[] args) {
        permutation("abc");
    }

}
    