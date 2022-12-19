package vezbi07.zadaca03;

public class SportskiKlub implements Comparable <SportskiKlub> {
	private String klub;
	private String sport;
	private int clenovi;
	
	public String getKlub() {
		return klub;
	}
	public void setKlub(String klub) {
		this.klub = klub;
	}
	
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	
	public int getClenovi() {
		return clenovi;
	}
	public void setKlub(int clenovi) {
		this.clenovi = clenovi;
	}
	
	
	public SportskiKlub(String klub, String sport, int clenovi) {
		this.klub = klub;
		this.sport = sport;
		this.clenovi = clenovi;
	}
	
	
	public int compareTo(SportskiKlub object) {
		SportskiKlub sk = (SportskiKlub) object;
		if(this.klub.equals(sk.klub)) {
			return 0;
		}
		else {
			return this.klub.compareTo(sk.klub);
		}
	}
	
}
