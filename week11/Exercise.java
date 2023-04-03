package week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise {

    public static List<Integer> iterativeSolution(List<Integer> lst, int n) {
        List<Integer> out = new ArrayList<>();
        if (n > lst.size()) {
            n = lst.size();
        }
        for (int i = 0; i < n; i++) {
            out.add(lst.get(i));
        }

        return out;
    }

    public static List<Integer> recursiveSolution(List<Integer> lst, int n) {
        List<Integer> out = new ArrayList<>();
        if (n == 0) {
            return out;
        } else if (lst.size() == 0) {
            return lst;

        } else {
            out.add(lst.remove(0));
            out.addAll(recursiveSolution(lst, n-1));
            return out;
        }
    }


    public static void main(String[] args) {
        Integer[] temp = {1, 3, 8, -1, 5, 1, 4};
        List<Integer> input = new ArrayList<>(Arrays.asList(temp));
        System.out.println(iterativeSolution(input, 8));
        System.out.println(recursiveSolution(input, 8));

    }
}
