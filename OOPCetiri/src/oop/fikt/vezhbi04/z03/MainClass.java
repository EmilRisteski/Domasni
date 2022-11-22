package oop.fikt.vezhbi04.z03;

public class MainClass {

	public static void main(String[] args) {
		Proizvod product = new Proizvod();
        System.out.println("Proizvod: " + product.getIme_na_proizvod());
        System.out.println("Proizvoditel: " + product.getProizvoditel());
        System.out.println("Cena: " + (int)product.getCena_na_prozivodot() + " denari.");
        System.out.println("Tezina: " + product.getTezhina());
	}

}
