package oop.fikt.vezhbi02.z07;

public class MainClass {
	public static void main(String[] args) {
		Triagolnik object1 = new Triagolnik();
		System.out.println("Perimetarot na triagolnikot iznesuva: " + Triagolnik.perimetar(10, 5, 7)+"cm");
		System.out.println("Plostinata na triagolnikot iznesuva: " + Triagolnik.plostina(10, 10) + "cm2");
	}
}
