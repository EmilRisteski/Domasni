package vezbi11.zadaca02;

import java.io.*;
import java.io.IOException;

public class Glavna {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Vnesi tekst: ");
		String text = br.readLine();
		System.out.println(text);
	}

}
