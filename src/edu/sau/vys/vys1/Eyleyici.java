package edu.sau.vys.vys1;

public class Eyleyici implements  IEyleyici{

    private boolean durum;
    private static Eyleyici instance;
    public static synchronized Eyleyici getInstance(){
        if(instance == null){
            instance = new Eyleyici();
        }
        return instance;
    }
    private Eyleyici(){
        this.durum = false;
    }
    @Override
    public void sogutucuAc(){
        System.out.println("Soğutucu Açılıyor......");
        this.durum = true;
        System.out.println("Soğutucu Açıldı.......");


    }
    @Override
    public void sogutucuKapat(){
        System.out.println("soğutucu kapatılıyor.......");
        if(this.durum) this.durum = false;
        else return;

    }
    @Override
    public boolean getDurum(){
        return this.durum;
    }
}
