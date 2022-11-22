package oop.fikt.vezhbi04.z02;

public class Restoran {
	private String ime_na_restoranot, lokacija, telefon;
    private int broj_na_sedishta;

    public Restoran(){
    }

    public String getIme_na_restoranot() {
        return ime_na_restoranot;
    }

    public void setIme_na_restoranot(String ime_na_restoranot) {
        this.ime_na_restoranot = ime_na_restoranot;
    }

    public String getLokacija() {
        return lokacija;
    }

    public void setLokacija(String lokacija) {
        this.lokacija = lokacija;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getBroj_na_sedishta() {
        return broj_na_sedishta;
    }

    public void setBroj_na_sedishta(int broj_na_sedishta) {
        this.broj_na_sedishta = broj_na_sedishta;
    }
}
