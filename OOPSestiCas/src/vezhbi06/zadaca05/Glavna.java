package vezhbi06.zadaca05;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<Integer> broevi = new ArrayList<>();
		
		broevi.add(15);
		broevi.add(7);
		broevi.add(21);
		broevi.add(48);
		broevi.add(12);
		
		System.out.println("Vtor element e: " + broevi.get(1));
	}

}
