package oop.fikt.vezhbi02.z02;

public class MainClass {
	public static void main(String[] args) {
		Vraboten object1 = new Vraboten ();
		object1.firstName = "Aleksandar";
		object1.lastName = "Spirovski";
		object1.plata = 15000;
		
		System.out.println("Imeto na vraboteniot e " + object1.firstName + ".");
		System.out.println("Prezimeto na vraboteniot e " + object1.lastName + ".");
		System.out.println("Imeto na vraboteniot e " + object1.plata + " denari.");
	}
}
