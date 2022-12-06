package vezhbi06.zadaca06;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<String> mails = new ArrayList<>();
		
		for(int i=1; i < 21; i++) {
			mails.add("mail" + i + "@yahoo.com");
		}
		System.out.println("Mails: " + mails);
	}

}
