package vezbi07.zadaca01;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<String> lekovi = new ArrayList<String>();
		lekovi.add("Analgin");
		lekovi.add("Lineks");
		lekovi.add("Paracetamol");
		
		if(lekovi.get(2).equals("Paracetamol")) {
			System.out.println("Lekot pomaga za namaluvanje na telesnata temperatura.");
		}
		else {
			System.out.println("Namenata na lekot e nepoznata.");
		}

	}

}
