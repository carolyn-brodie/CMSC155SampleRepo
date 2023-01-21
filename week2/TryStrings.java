package week2;

public class TryStrings {
    public static void main(String[] args) {
        String s1 = "Hi There";
        String s2 = new String("Hi There");
        char c1 = 'h';
//        System.out.println(s1);
//        System.out.println(s2);
//
////        //Equality Test
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));

//        //Compare Strings
        //"a" < "b"
        //System.out.println("carrier".compareTo("car"));

        //Length of a String
        System.out.println("Length of s1 is " + s1.length());
//        //other functions
        String title = "Harry Potter";
        char oneLetter = title.charAt(6);
        System.out.println(oneLetter);
        System.out.println(title.charAt(0));
        System.out.println(title.charAt(title.length()-1));
//
//
//        String substring = title.substring(6, 9);
//        System.out.println(substring);
// makes substring = ”Pot" - from positions 6 to 8
//Character at position 9 is NOT included.


    }
}
