package oop.fikt.vezhbi03.z04;
import java.util.Random;

public class Brojach {
	public String[] slucaj = {"Glava", "Pismo"};
	public int numOfTimes;
	public int Pismo = 0;
	public int Glava = 0;
	
	public void zgolemuvanjeBrojach(int numOfTimes) {
		for(int i=0; i<this.numOfTimes; i++) {
			String rand = (slucaj[new Random().nextInt(slucaj.length)]);
			if(rand == "Glava") {
				this.Glava++;
			}
			if(rand=="Pismo") {
				this.Pismo++;
			}
		}
		System.out.println("Broj na pati koga parickata padna na pismo: " + this.Pismo);
		System.out.println("Broj na pati koga parickata padna na glava: " + this.Glava);
	}
	public void resetiranjeBrojach(int Pismo, int Glava) {
		this.Glava = 0;
		this.Pismo = 0;
	}
}
