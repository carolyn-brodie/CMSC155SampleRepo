package week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort2 {

    public static List<Integer> merge(List<Integer> list1, List<Integer> list2) {

        if (list1.size() == 0) return list2;
        else if (list2.size() == 0) return list1;
        else {
            ArrayList<Integer> temp = new ArrayList<>();
            if (list1.get(0) < list2.get(0)) {
                temp.add(list1.remove(0));

            } else {
                temp.add(list2.remove(0));
            }
            temp.addAll(merge(list1, list2));
            return temp;
        }
    }





    public static List<Integer> sortLists(List<Integer> arrList) {

          if (arrList.size() > 1) {
              int midIndex = arrList.size() / 2;
              //split list
              List<Integer> leftList = new ArrayList<>(arrList.subList(0, midIndex));
              List<Integer> rightList = new ArrayList<>(arrList.subList(midIndex, arrList.size()));

              //recurse on each half of list
              leftList = sortLists(leftList);
              rightList = sortLists(rightList);

              //Merge the sorted lists
              arrList = merge(leftList, rightList);
            }
            return arrList;
    }

    public static void main(String[] args) {

//
//        Integer[]  lst2 = {3, 6};
//        Integer[] lst1 = {2, 4, 5};
//        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList((lst1)));
//        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList((lst2)));
//        System.out.println(l1);
//        System.out.println(l2);
//        System.out.println(merge(l1, l2));


        Integer arr[] = {90, 65,7,305,120,110,8};
        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(arr));
        System.out.println(lst);
        System.out.println(sortLists(lst));


    }

}
    