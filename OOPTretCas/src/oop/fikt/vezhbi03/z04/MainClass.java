package oop.fikt.vezhbi03.z04;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		try(Scanner input = new Scanner(System.in)) {
			Brojach brojac = new Brojach();
			System.out.println("Vnesi broj na frlanja na parickata: ");
			brojac.numOfTimes = input.nextInt();
			brojac.zgolemuvanjeBrojach(brojac.numOfTimes);
			brojac.resetiranjeBrojach(brojac.Glava, brojac.Pismo);
		}
	}
}
