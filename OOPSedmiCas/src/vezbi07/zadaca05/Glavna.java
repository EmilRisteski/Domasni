package vezbi07.zadaca05;

import java.util.HashSet;
import java.util.Set;

public class Glavna {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("A");
		set1.add("B");
		set1.add("C");
		
		Set<String> set2 = new HashSet<String>();
		set2.add("D");
		set2.add("E");
		set2.add("B");
		
		Set<String> set3 = new HashSet<String>();
		set3.addAll(set1);
		Set<String> set4 = new HashSet<String>();
		set3.addAll(set2);
		
		set1.retainAll(set2);
		System.out.println("Presek na dvete mnozestva: " + set1);
		
		set3.addAll(set4);
		System.out.println("Unija na dvete mnozevstva: " + set3);
		
		
	}

}
