package vezbi07.zadaca03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<SportskiKlub> list = new ArrayList<SportskiKlub>();
		list.add(new SportskiKlub ("New Jersey Devils", "Hokej",20));
		list.add(new SportskiKlub ("Barcelona", "Fudbal", 15));
		list.add(new SportskiKlub ("Los Angeles Lakers", "Kosarka", 16));
		
		
		Collections.sort(list);
		
		for(SportskiKlub sk : list) {
			System.out.println(sk.getKlub());
			System.out.println(sk.getSport());
			System.out.println(sk.getClenovi());
		}
	}
}
