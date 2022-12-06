package vezhbi06.zadaca10;

import java.util.ArrayList;
import java.util.List;

public class GlavnaKlasa {

	public static void main(String[] args) {
		List<String> bendovi = new ArrayList<>();
		List<String> bendovi2 = new ArrayList<>();
		
		bendovi.add("Guns 'N' Roses");
		bendovi.add("The Doors");
		
		bendovi2.add("Rammstein");
		bendovi2.add("Slikpnot");
		
		bendovi.addAll(bendovi2);
		
		System.out.println("Bendovi: " + bendovi);
	}

}
