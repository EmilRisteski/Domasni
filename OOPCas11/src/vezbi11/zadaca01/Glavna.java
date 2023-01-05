package vezbi11.zadaca01;

import java.io.IOException;

public class Glavna {

	public static void main(String[] args) throws IOException {
		Datoteka object =  new Datoteka("File.txt");
		object.zapisi("Happy New Year");
		object.citaj();
	}

}
