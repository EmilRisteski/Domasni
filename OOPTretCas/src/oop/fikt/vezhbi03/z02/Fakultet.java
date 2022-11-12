package oop.fikt.vezhbi03.z02;

public class Fakultet {
	public String nazivNaFakultet;
	public int brojNaSmerovi;
	public int brojNaStudenti;
	public String dekan;
	public String sediste;
	

	public int zgolemuvanjeBrS() {
		int studenti;
		studenti = brojNaStudenti + 50;
		return studenti;
	}
	
	public int namaluvanjeBrS(int namali) {
		int studentiN;
		studentiN = brojNaStudenti - namali;
		return studentiN;
	}
	
	public void fakultetInf() {
		System.out.println("Ime na fakultetot: " + nazivNaFakultet);
		System.out.println("Sediste na fakultetot: " + sediste);
		System.out.println("Dekan: " + dekan);
		System.out.println("Broj na smerovi " + brojNaSmerovi);
	}
}
