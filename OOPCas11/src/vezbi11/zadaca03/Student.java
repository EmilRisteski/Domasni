package vezbi11.zadaca03;

public class Student {
	private String ime;
	private String prezime;
	private int index;
	
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
	
	
	public int getindex() {
		return index;
	}
	public void setindex(int index) {
		this.index = index;
	}
	
	public Student(String ime, String prezime, int index) {
		this.ime = ime;
		this.prezime = prezime;
		this.index = index;
	}
}
