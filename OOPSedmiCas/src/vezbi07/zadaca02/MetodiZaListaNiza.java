package vezbi07.zadaca02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetodiZaListaNiza {
	
	public void listToArray (List<String> lista1) {
		String[] niza = new String [lista1.size()];
		lista1.toArray(niza);
		System.out.println("Listata pretvorena vo niza: ");
		
		for (String s : niza) {
			System.out.println(s);
		}
	}
	
	public void arrayToList(String[] niza) {
		List<String> lista1 = new ArrayList<String>();
		lista1 = Arrays.asList(niza);
		System.out.println("Nizata pretvorena vo lista: ");
		
		for(String s : lista1) {
			System.out.println(s);
		}
	}
}
