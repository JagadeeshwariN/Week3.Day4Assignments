package week3.day4.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		// Declare an array {3, 2, 11, 4, 6, 7} and move it to List

		int[] a= {3, 2, 11, 4, 6, 7};
		
		List <Integer> list1= new ArrayList<Integer>();
		
		for (int num1 : a) {
			   list1.add(num1);
		}
		System.out.println("Before Sorting : " + list1);
		Collections.sort(list1);
		System.out.println("After Sorting :" + list1);
		int size= list1.size();
		System.out.println("Size is :"+ size);
		System.out.println("Second Largest is :" + list1.get(size-2) );
	}

}
