package vezbi09.zadaca02;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		XMLCreator xml = new XMLCreator();
		List<Vraboten> vraboten = new ArrayList<Vraboten>();
		vraboten.add(new Vraboten("Stefan", "Stefanoski", 10000));
		vraboten.add(new Vraboten("Aleksandar", "Ristevski", 15000));
		xml.createXML("XML.xml", vraboten);
	}

}
