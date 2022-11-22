package oop.fikt.vezhbi04.z03;

public class Proizvod {
	private String ime_na_proizvod, proizvoditel, tezhina;
    private int cena_na_prozivodot;

    public Proizvod(){
        this.ime_na_proizvod = "Marlboro Touch";
        this.cena_na_prozivodot = 130;
        this.proizvoditel = "Marlboro";
        this.tezhina = "90g";
    }

    public String getIme_na_proizvod() {
        return ime_na_proizvod;
    }

    public void setIme_na_proizvod(String ime_na_proizvod) {
        this.ime_na_proizvod = ime_na_proizvod;
    }

    public String getProizvoditel() {
        return proizvoditel;
    }

    public void setProizvoditel(String proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    public String getTezhina() {
        return tezhina;
    }

    public void setTezhina(String tezhina) {
        this.tezhina = tezhina;
    }

    public int getCena_na_prozivodot() {
        return cena_na_prozivodot;
    }

    public void setCena_na_prozivodot(int cena_na_prozivodot) {
        this.cena_na_prozivodot = cena_na_prozivodot;
    }
}
