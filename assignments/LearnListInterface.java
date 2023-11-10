package week3.day4.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LearnListInterface {

	public static void main(String[] args) {
// Declare a String array and add the values as {HCL, Wipro, Aspire Systems, CTS}
		
		List <String> companys= new ArrayList<String>();
		companys.add("HCL");
		companys.add("Wipro");
	    companys.add("Aspire");
	    companys.add("CTS");
	    System.out.println("Before Sorting :" + companys);
	    
	    Collections.sort(companys);
	    System.out.println("After Sorting :" + companys);
	    
	    int size= companys.size();
	    System.out.println("List Size: " + size);
	    
	    for (int i=companys.size()-1; i>=0; i--)
	    {
	    	 
	    	 System.out.println(companys.get(i));
		}
	
	}
}
