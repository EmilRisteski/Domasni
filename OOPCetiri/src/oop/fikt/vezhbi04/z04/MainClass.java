package oop.fikt.vezhbi04.z04;

public class MainClass {

	public static void main(String[] args) {
		Avtomobil avtomobil = new Avtomobil("Ford", "Mustang","Blue", 310000);

        System.out.println("Marka na avtomobilot: " + avtomobil.getMarka());
        System.out.println("Model na avtomobilot: " + avtomobil.getModel());
        System.out.println("Boja na avtomobilot: " + avtomobil.getBoja());
        System.out.println("Pominati kilometri: " + avtomobil.getPominatiKM());
        System.out.println("Presmetkata na metodot: " + avtomobil.metod_za_presmetka(24));
	}

}
