package oop.fikt.vezhbi02.z05;

public class Predmet {
	public String predmet;
	public int semestar;
	public String profesor;
	public int krediti;
	
	// Konstruktor za prv objekt
	public Predmet() {
		
	}
	
	// Konstruktor za vtor objekt
	public Predmet(String predmet) {
		this.predmet = predmet;
	}
	
	// Konstruktor za tret objekt
	public Predmet(int semestar, String profesor, int krediti) {
		this.semestar = semestar;
		this.profesor = profesor;
		this.krediti = krediti;
	}
}
