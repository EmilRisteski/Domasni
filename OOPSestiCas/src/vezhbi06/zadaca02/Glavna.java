package vezhbi06.zadaca02;

import java.util.ArrayList;
import java.util.List;

public class Glavna {
	public static void main(String[] args) {
		List<String> drzavi = new ArrayList<>();
		
		drzavi.add("Makedonija");
		drzavi.add("Velika Britanija");
		drzavi.add("Norveska");
		drzavi.add("Francija");
		
		System.out.println("Golemina na listata: " + drzavi.size());
		
		if(drzavi.size() == 3) {
			drzavi.add("Srbija");
			drzavi.add("Germanija");
		}
		else {
			System.out.println("Elementite na listata se: " + drzavi);
		}
		
	}
}
