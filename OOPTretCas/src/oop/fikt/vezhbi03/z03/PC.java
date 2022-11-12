package oop.fikt.vezhbi03.z03;

public class PC {
	public int memorija;
	public String tipNaMemorija;
	public int hardDisk;
	public String golemina = "GB";
	
	public PC() {
		this.memorija = 2;
		this.tipNaMemorija = "DDR2";
		this.hardDisk = 160;
	}
	
	public void HDmemorija(int zgolemiMemorija, int novHardDisk) {
		int zgolemenaM = memorija + zgolemiMemorija;
		int novHD = hardDisk + novHardDisk;
		System.out.println("Memorijata bese " + memorija + golemina + ", sega iznesuva " +	zgolemenaM + golemina + ".");
		System.out.println("Tipot na memorijata e " + tipNaMemorija + ".");
		System.out.println("HD ima golemina " + novHD + golemina + ". Prethodno iznesuva " + hardDisk + golemina + ".");
	}
}
