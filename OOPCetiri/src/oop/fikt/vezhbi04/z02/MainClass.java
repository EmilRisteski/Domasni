package oop.fikt.vezhbi04.z02;

public class MainClass {

	public static void main(String[] args) {
		Restoran restaurant = new Restoran();
		restaurant.setIme_na_restoranot("Akademi");
		restaurant.setLokacija("Prilep");
		restaurant.setTelefon("048555007");
		restaurant.setBroj_na_sedishta(100);

        System.out.println("Ime na restoranot: " + restaurant.getIme_na_restoranot());
        System.out.println("Lokacija na restoranot: " + restaurant.getLokacija());
        System.out.println("Telefonski broj na restoranot: " + restaurant.getTelefon());
        System.out.println("Broj na sedishta: " + restaurant.getBroj_na_sedishta());
	}

}
