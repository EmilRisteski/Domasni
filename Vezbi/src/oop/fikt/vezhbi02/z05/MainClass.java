package oop.fikt.vezhbi02.z05;

import oop.fikt.vezhbi02.Student;

public class MainClass {
	public static void main(String[] args) {
		Predmet object1 = new Predmet ();
		object1.predmet = "Delovni Komunikaciski Vestini";
		object1.semestar = 1;
		object1.profesor = "Dragan Gruevski";
		object1.krediti = 6;
		
		System.out.println("Ime na predmetot: " + object1.predmet);
		System.out.println("Semestar: " + object1.semestar);
		System.out.println("Ime na profesorot: " + object1.profesor);
		System.out.println("Broj na krediti: " + object1.krediti + "\n");
		
		Predmet object2 = new Predmet ("Objektno Orientirano Programiranje");
		System.out.println("Ime na predmetot: " + object2.predmet);
	
		Predmet object3 = new Predmet (3, "Ilija Joveski", 6);
		System.out.println("Semestar: " + object3.semestar + ", Ime na profesorot: " + object3.profesor + ", krediti: " + object3.krediti);
		
	}
}
