package vezbi09.zadac01;

import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XML {
	public void createXML(String fileName, List<Vraboten>vraboten) {
		try {
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.newDocument();
			
			Element root = document.createElement("Vraboten");
			document.appendChild(root);
			
			for(int i=0; i<vraboten.size(); i++) {

				Element ime = document.createElement("Ime");
				root.appendChild(ime);
				ime.appendChild(document.createTextNode(vraboten.get(i).getime()));
				
				Element prezime = document.createElement("Prezime");
				root.appendChild(prezime);
				prezime.appendChild(document.createTextNode(vraboten.get(i).getprezime()));
				
				Element plata = document.createElement("Plata");
				root.appendChild(plata);
				plata.appendChild(document.createTextNode(String.valueOf(vraboten.get(i).getplata())));
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			
			DOMSource source = new DOMSource(document);
			StreamResult result = new StreamResult(new File(fileName));
			StreamResult result1 = new StreamResult(System.out);
			
			transformer.transform(source, result);
			
			System.out.println("Fajlot e kreiran, imeto e: " + fileName);
			System.out.println(result1);
			System.out.println("Fajlot e zacuvan");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
