package vezbi09.zadac01;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		XML xml = new XML();
		List<Vraboten> vraboten = new ArrayList<Vraboten>();
		vraboten.add(new Vraboten("Stefan", "Stefanovski", 10000));
		xml.createXML("XMLFajl.xml", vraboten);
	}

}
