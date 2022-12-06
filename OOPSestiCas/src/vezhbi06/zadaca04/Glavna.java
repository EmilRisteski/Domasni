package vezhbi06.zadaca04;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Glavna {

	public static void main(String[] args) {
		List<Integer> broevi = new ArrayList<>();
		
		broevi.add(7);
		broevi.add(3);
		broevi.add(13);
		broevi.add(26);
		broevi.add(18);
		
		Collections.sort(broevi);
		
		System.out.println("Sortirani elementi: " + broevi);
	}

}
