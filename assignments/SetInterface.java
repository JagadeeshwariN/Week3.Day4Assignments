package week3.day4.assignments;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) 
	{
		
		String companyName= "google";
		char[] charArray = companyName.toCharArray();
		
		System.out.println("Character Length : " + charArray.length);
		System.out.println(charArray);
		
        Set<Character> uniqueChar= new LinkedHashSet<Character>();
		

		for (char a :charArray)
		{
		 uniqueChar.add(a); 
		 }
		 System.out.println(uniqueChar);
	}
}

