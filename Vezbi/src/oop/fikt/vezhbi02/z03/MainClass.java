package oop.fikt.vezhbi02.z03;

public class MainClass {
	public static void main(String[] args) {
		Covek object1 = new Covek();
		object1.firstName = "Emil";
		object1.lastName = "Risteski";
		object1.maticenBroj = 312100944;
		
		System.out.println("Imeto na covekot e: " + object1.firstName + ".");
		System.out.println("Prezimeto na covekot e: " + object1.lastName + ".");
		System.out.println("Covekot ima maticen broj: " + object1.maticenBroj + ".");
	}
}
