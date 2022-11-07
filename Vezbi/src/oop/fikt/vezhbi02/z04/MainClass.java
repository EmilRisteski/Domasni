package oop.fikt.vezhbi02.z04;

public class MainClass {
	public static void main(String[] args) {
		Avtomobil object1 = new Avtomobil();
		object1.marka = "Audi";
		object1.model = "A3";
		object1.kilometri = 23000;
		
		System.out.println("Podatoci za prviot avtomobil:");
		System.out.println("Marka: " + object1.marka + ", Model: " + object1.model + ", Pominati kilometri: " + object1.kilometri + "km");
		
		Avtomobil object2 = new Avtomobil("Ford", "Mustang", 37000);
		
		System.out.println("Podatoci za vtoriot avtomobil:");
		System.out.println("Marka: " + object2.marka + ", Model: " + object2.model + ", Pominati kilometri: " + object2.kilometri + "km");
	}
}
