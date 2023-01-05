package vezbi11.zadaca03;

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

public class XmlCreator {
	public void createXml(String filename, List<Student>student) {
		
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
			Document document = documentBuilder.newDocument();
			
			Element root = document.createElement("Studenti");
			document.appendChild(root);
			
			for(int i=0; i<student.size(); i++) {
				Element studentElement = document.createElement("Student");
				root.appendChild(studentElement);
				
				studentElement.setAttribute("ID", String.valueOf(i));
				
				Element ime = document.createElement("Ime");
				studentElement.appendChild(ime);
				ime.appendChild(document.createTextNode(student.get(i).getime()));
				
				Element prezime = document.createElement("Prezime");
				studentElement.appendChild(prezime);
				prezime.appendChild(document.createTextNode(student.get(i).getprezime()));
				
				Element index = document.createElement("Index");
				studentElement.appendChild(index);
				index.appendChild(document.createTextNode(String.valueOf(student.get(i).getindex())));
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			
			DOMSource source = new DOMSource(document);
			
			StreamResult result = new StreamResult(new File(filename));
			
			transformer.transform(source, result);
			
			System.out.println("Ime na fajlot " + filename);
			System.out.println("Fajlot e zacuvan");
			
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
