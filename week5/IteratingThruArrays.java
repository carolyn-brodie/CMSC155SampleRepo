package week5;

public class IteratingThruArrays {

    public static void main(String[] args) {
        int[] arrayName = {-10, -1 , -5, 92, -87};


        boolean positiveFound = false;
        for (int count = 0; count < arrayName.length; count++) {
            if (arrayName[count] > 0) {
                positiveFound = true;
            }
        }
        System.out.println(positiveFound);

        positiveFound = false;
        int count = 0;
        while ((count < arrayName.length) && !positiveFound)
        {
            if (arrayName[count] > 0) {
                positiveFound = true;
            }
            count++;
        }
        System.out.println(positiveFound);

        positiveFound = false;
        for (int item : arrayName) {
            if (item > 0) {
                positiveFound = true;
            }
        }

        System.out.println(positiveFound);

    }
}
