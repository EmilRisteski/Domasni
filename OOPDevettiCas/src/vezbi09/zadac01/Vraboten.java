package vezbi09.zadac01;

public class Vraboten {
	private String ime;
	private String prezime;
	private int plata;
	
	public String getime() {
		return ime;
	}
	public void setime(String ime) {
		this.ime = ime;
	}
	
	
	public String getprezime() {
		return prezime;
	}
	public void setprezime(String prezime) {
		this.prezime = prezime;
	}
	
	
	public int getplata() {
		return plata;
	}
	public void setplata(int plata) {
		this.plata = plata;
	}
	
	
	public Vraboten(String ime, String prezime, int plata) {
		this.ime = ime;
		this.prezime = prezime;
		this.plata = plata;
	}
	
}
