package vezhbi06.zadaca08;

import java.util.ArrayList;
import java.util.List;

public class Glavna {
	public static void main(String[] args) {
		List<String> mails = new ArrayList<>();
		
		for (int i=5; i < 21; i=i+5) {
			mails.add("mail" + i +"@yahoo.com");
		}
		System.out.println(mails);
	}
}
