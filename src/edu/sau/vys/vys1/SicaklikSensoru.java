package edu.sau.vys.vys1;

public class SicaklikSensoru implements ISicaklikSensoru {
    private  double sicaklik;
    private static SicaklikSensoru instance;
    public static synchronized SicaklikSensoru getInstance(){
        if(instance == null){
            instance = new SicaklikSensoru();
        }
        return instance;
    }
    private SicaklikSensoru(){
        this.sicaklik = Math.random() *100 +0;
    }
    @Override
    public double sicaklikDegeral(){
        return this.sicaklik;
    }
}
