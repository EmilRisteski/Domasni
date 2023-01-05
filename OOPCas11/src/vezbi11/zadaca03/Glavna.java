package vezbi11.zadaca03;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		XmlCreator xml = new XmlCreator();
		List<Student> student = new ArrayList<Student>();
		student.add(new Student("Emil", "Risteski", 807));
		student.add(new Student("David", "Jordanoski", 814));
		student.add(new Student("Elena", "Risteska", 876));
		xml.createXml("xmlFajl.xml", student);
	}

}
