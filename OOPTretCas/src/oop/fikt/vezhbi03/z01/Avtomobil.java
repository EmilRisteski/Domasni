package oop.fikt.vezhbi03.z01;

public class Avtomobil {
	public String marka;
	public String model;
	public String boja;
	public double pominatiKm;
	public int godinaNaProizvodstvo;
	public String registracija;
	
	public Avtomobil (String marka, String model, String boja, int pominatiKm, int godinaNaProizvodstvo, String registracija) {
		this.marka = marka;
		this.model = model;
		this.boja = boja;
		this.pominatiKm = pominatiKm;
		this.godinaNaProizvodstvo = godinaNaProizvodstvo;
		this.registracija = registracija;
	}
	
	public void carInf() {
		System.out.println("Marka na avtomobilot: " + marka);
		System.out.println("Model na avtomobilot: " + model);
		System.out.println("Boja na avtomobilot: " + boja);
	}
	
	public double kmValue() {
		double value;
		value = pominatiKm + 1520.25;
		return value;
	}
}
