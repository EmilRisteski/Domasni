package vezhbi06.zadaca09;

public class Fakultet {
	private String ime;
	private int brNaSmerovi;
	private int studenti;
	
	public Fakultet(String ime, int brNaSmerovi, int studenti) {
		this.ime = ime;
		this.brNaSmerovi = brNaSmerovi;
		this.studenti = studenti;
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public int getbrNaSmerovi() {
		return brNaSmerovi;
	}
	public void setbrNaSmerovi(int brNaSmerovi) {
		this.brNaSmerovi = brNaSmerovi;
	}
	
	public int getstudenti() {
		return studenti;
	}
	public void setstudenti(int studenti) {
		this.studenti = studenti;
	}
}
