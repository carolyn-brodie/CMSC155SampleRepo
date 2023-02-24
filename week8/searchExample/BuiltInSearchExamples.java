package week8.searchExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class BuiltInSearchExamples {

	public static void main(String[] args) {
		Integer[] array = {-4, -2, 1, 10, -5,  33, 65, 89, 101, 2, 190};
		ArrayList<Integer> lst = new ArrayList<Integer>(Arrays.asList(array)); 
		
		Integer[] array2 = {3,100,3000,5069};
		ArrayList<Integer> lst2 = new ArrayList<Integer>(Arrays.asList(array2));
		
		//linear search
		System.out.println(lst.indexOf(1));
		
		
		//binary search
		System.out.println(Arrays.binarySearch(array2, 3000));
		System.out.println(Collections.binarySearch(lst2, 3000));

	}

}
