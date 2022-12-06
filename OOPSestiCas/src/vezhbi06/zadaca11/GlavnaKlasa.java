package vezhbi06.zadaca11;

import java.util.ArrayList;
import java.util.List;

public class GlavnaKlasa {

	public static void main(String[] args) {
		List<String> bendovi = new ArrayList<>();
		List<String> bendovi2 = new ArrayList<>();
		
		bendovi.add("Royal Blood");
		bendovi.add("SMKC");
		
		bendovi2.add("Royal Blood");
		bendovi2.add("The Doors");
		
		bendovi.retainAll(bendovi2);
		
		System.out.println(bendovi);

	}

}
