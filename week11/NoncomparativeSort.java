package week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoncomparativeSort {
    public static final int OLDEST_PERSON = 120;

    public static void pigeonHoleSort(Person arr[]) {
        List<Person>[] listArray = new ArrayList[OLDEST_PERSON];

        //initialize all ArrayLists
        for (int i = 0; i < listArray.length; i++) {
            listArray[i] = new ArrayList<>();
        }

        //sort
        for (Person individual : arr) {
            listArray[individual.getAge()].add(individual);
        }

        //put initial array in order
        int count = 0;
        for (int index =0; index < listArray.length; index++) {
            for (int index2 =0; index2 < listArray[index].size(); index2++) {
                arr[count] = listArray[index].get(index2);
                count++;
            }
        }


    }

    public static void main(String[] args) {
        Person test[] = {new Person("Jane", 53),
        new Person("Sam", 10), new Person("Holly", 2),
        new Person("Suzy", 25)};
        System.out.println(Arrays.toString(test));
        pigeonHoleSort(test);
        System.out.println(Arrays.toString(test));
    }
}
