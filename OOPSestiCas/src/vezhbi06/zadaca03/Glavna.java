package vezhbi06.zadaca03;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<String> smerovi = new ArrayList<>();
		
		smerovi.add("INKI");
		smerovi.add("IKT");
		smerovi.add("Smer4");
		smerovi.add(2, "Smer3");
		
		System.out.println("Smerovite se: " + smerovi);

	}

}
