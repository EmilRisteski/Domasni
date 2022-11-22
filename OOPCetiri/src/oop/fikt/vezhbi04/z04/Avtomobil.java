package oop.fikt.vezhbi04.z04;

public class Avtomobil {
	private String marka, model,boja;
    private double pominatiKM;

    public Avtomobil(String marka, String model, String boja, int pominatiKM){
        this.marka = marka;
        this.model = model;
        this.boja = boja;
        this.pominatiKM = pominatiKM;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public double getPominatiKM() {
        return pominatiKM;
    }

    public void setPominatiKM(double pominatiKM) {
        this.pominatiKM = pominatiKM;
    }

    public double metod_za_presmetka(int pomnozhiKM){
        double presmetka = this.pominatiKM * pomnozhiKM;
        return presmetka;
    }
}
