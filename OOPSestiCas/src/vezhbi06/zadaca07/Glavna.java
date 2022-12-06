package vezhbi06.zadaca07;

import java.util.ArrayList;
import java.util.List;

public class Glavna {
	public static void main(String[] args) {
		List<String> mails = new ArrayList<>();
		
		for(int i=1; i < 21; i++) {
			if(i<10) {
				mails.add("mail0" + i + "yahoo.com" );
			}
			else {
				mails.add("mail" + i + "yahoo.com" );
			}
		}
		System.out.println(mails);
	}
}
