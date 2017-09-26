package PS4;

import java.util.*;

public class PE7 {   
	public static void main(String[] args) {    
		ArrayList<String> c1= new ArrayList<String>();
		c1.add("Java");
		c1.add("C");
		c1.add("C++");
		c1.add("Python");
		c1.add("JavaScript");
		
		ArrayList<String> c2= new ArrayList<String>();
		c2.add("Java");
		c2.add("Angular");
		c2.add("C++");
		c2.add("JavaScript");
		
		for(boolean isPresent : present(c1, c2)) {
			if(isPresent) System.out.println("Yes");
			else System.out.println("No");
		}
		
	}
	
	public static List<Boolean> present(List<String> l1, List<String> l2) {
		HashSet<String> languageSet = new HashSet<String>();
		for(String language: l2) {
			languageSet.add(language);
		}
		
		List<Boolean> isPresent = new ArrayList<Boolean>();
		
		for(String language: l1) {
			if(languageSet.contains(language)) {
				isPresent.add(true);
			} else {
				isPresent.add(false);
			}
		}
		
		return isPresent;
	}
}
