package oop.fikt.vezhbi04.z01;

public class MainClass {
	public static void main(String[] args) {
		Covek object = new Covek();
		object.setIme("Emil");
		object.setPrezime("Risteski");
		object.setmaticenBroj("2008002440088");
        System.out.println("Ime: " + object.getIme());
        System.out.println("Prezime: " + object.getPrezime());
        System.out.println("Maticen broj: " + object.getmaticenBroj());
    
	}
}
