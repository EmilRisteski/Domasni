package oop.fikt.vezhbi03.z02;

public class MainClass {
	public static void main(String[] args) {
		Fakultet fakultet1 = new Fakultet();
		fakultet1.nazivNaFakultet = "FIKT";
		fakultet1.brojNaSmerovi = 8;
		fakultet1.brojNaStudenti = 150;
		fakultet1.dekan = "Aleksandar Markoski";
		fakultet1.sediste = "Bitola";
		
		fakultet1.fakultetInf();
		System.out.println("Broj na studenti posle zgolemuvanje: " + fakultet1.zgolemuvanjeBrS() + " studenti.");
		System.out.println("Broj na studenti posle namaluvanje: " + fakultet1.namaluvanjeBrS(20) + " studenti.");
		System.out.println(" ");
		
		Fakultet fakultet2 = new Fakultet();
		fakultet2.nazivNaFakultet = "Tehnicki Fakultet";
		fakultet2.brojNaSmerovi = 8;
		fakultet2.brojNaStudenti = 130;
		fakultet2.dekan = "Mitko Kostov";
		fakultet2.sediste = "Bitola";
		
		fakultet2.fakultetInf();
		System.out.println("Broj na studenti posle zgolemuvanje: " + fakultet2.zgolemuvanjeBrS() + " studenti.");
		System.out.println("Broj na studenti posle namaluvanje: " + fakultet2.namaluvanjeBrS(40) + " studenti.");	
	}
}
