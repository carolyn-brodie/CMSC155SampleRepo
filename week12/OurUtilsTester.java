package week12;

/**
 * Created by Owner on 4/17/2017.
 */

public class OurUtilsTester {

    public static void main(String[] args) {
        String[] array1 = {"hi", "bye", "sigh"};
        Double[] array2 = {3.4, 5.9, 8.0, 1.3};
//        OurUtils.printStrings (array1);
        OurUtils.print(array1);
//
      OurUtils.print(array2);
//

//
        NCBankAccount[] bankArray = {new NCBankAccount("Marschall", 100), new NCBankAccount("Suzy", 500), new NCBankAccount("Ted", 250)};
        OurUtils.print(bankArray);

// find minimums
//        System.out.println(OurUtils.minInteger(array2));
        System.out.println (OurUtils.min(array2));

        System.out.println (OurUtils.min(bankArray));


    }
}
