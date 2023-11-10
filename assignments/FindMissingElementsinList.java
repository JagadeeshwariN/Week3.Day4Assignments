package week3.day4.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingElementsinList {

	
		public static void main(String[] args) {

			int a[]= {1, 2, 3, 4, 10, 6, 8}; 
			 
			List <Integer> list1= new ArrayList<Integer>();
			
			for (int num1 : a) {
				   list1.add(num1);
			}
			
			
			System.out.println("Given List: " + list1);
			Collections.sort(list1);
			System.out.println("Sorted List: " + list1);
			 int size= list1.size();
			System.out.println("Missing Number in the given array is :  ");
			
			for (int i = 0; i <size-1 ; i++) 
			{
			
				if (a[i+1]- a[i] != 1)
				{
						System.out.println((a[i]+1) );
				}	
			}
			
		}
	}


