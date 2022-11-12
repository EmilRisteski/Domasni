package oop.fikt.vezhbi03.z01;

public class MainClass {
	public static void main(String[] args) {
		Avtomobil avtomobil = new Avtomobil("Ford", "Mustang", "Plava", 10000, 1993, "PP-666-AC" );
		avtomobil.carInf();
		System.out.println("Brojot na pominati kilometri iznesuva: " + avtomobil.kmValue() + "km.");
	}
}
