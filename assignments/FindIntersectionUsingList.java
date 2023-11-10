package week3.day4.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {
		int[] a={3,2,11,4,6,7}; 
	    int[] b={1,2,8,4,9,7};
	  
	    List <Integer> list1= new ArrayList<Integer>();
	    List <Integer> list2= new ArrayList<Integer>();
	    
	   for (int num1 : a) {
		   list1.add(num1);
		
	}
	   for (int num2 : b) {
		   list2.add(num2);
	   }
	    
	    for (int i = 0; i < list1.size(); i++) 
	    {
	    	for (int j = 0; j < list2.size(); j++) 
	    	{
	    		  		
				if (a[i] == b[j])
				{
					System.out.println( a[i] + " " +  b[j]);
				}
	    	
	    	
	    	}
	    	
			
		}
	}
}
