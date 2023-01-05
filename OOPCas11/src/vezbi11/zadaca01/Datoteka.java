package vezbi11.zadaca01;

import java.io.*;
import java.io.IOException;

public class Datoteka {
	String name;
	FileInputStream in;
	FileOutputStream out;
	
	public Datoteka(String name) {
		this.name = name;
	}
	
	public void zapisi(String text) throws IOException{
		out = new FileOutputStream(name);
		for(int i=0; i<text.length(); i++) {
			out.write(text.charAt(i));
		}
	}
	
	public void citaj() throws IOException {
		in = new FileInputStream(name);
		int c;
		while((c=in.read()) !=-1) {
			System.out.println((char) c);
		}
		in.close();
	}
}
