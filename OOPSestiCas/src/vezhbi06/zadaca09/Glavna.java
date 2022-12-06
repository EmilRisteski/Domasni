package vezhbi06.zadaca09;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<Fakultet> fakulteti = new ArrayList<>();
		
		Fakultet fakultet1 = new Fakultet("FIKT", 2, 150);
		fakulteti.add(fakultet1);
		Fakultet fakultet2 = new Fakultet("Tehnicki", 5, 200);
		fakulteti.add(fakultet2);
		Fakultet fakultet3 = new Fakultet("Pedagoski", 3, 100);
		fakulteti.add(fakultet3);
		Fakultet fakultet4 = new Fakultet("FINKI", 4, 1000);
		fakulteti.add(fakultet4);
		Fakultet fakultet5 = new Fakultet("Biotehnicki", 3, 50);
		fakulteti.add(fakultet5);
		
		for (int i = 0; i < fakulteti.size(); i ++){
			System.out.println(fakulteti.get(i).getIme() + " " + fakulteti.get(i).getbrNaSmerovi() + " " + fakulteti.get(i).getstudenti());
		}

	}

}
