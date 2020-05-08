package edu.sau.vys.vys1;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class AgArayuzu implements IAgArayuzu {
    private IPerson kisi;
    private ArrayList<IMerkeziIslemBirimi> m;
    private int islem;
    public AgArayuzu() throws SQLException {
        m = new ArrayList<>();
        agaBaglan();
        kisi = new Person();

    }
    @Override
    public void agaBaglan(){
        System.out.println("Ağa bağlanıyor..........");

    }
    public void islemSeciniz() throws SQLException {
        if(this.kisi.getAd().equals(null));
        boolean devam=true;
        while (devam) {
            System.out.println("***************HOŞGELDİNİZ SAYIN " + kisi.getAd() + " " + kisi.getSoyad() + "*********************");
            System.out.println("***************MENÜ************************************************************************");
            System.out.println("1-Sıcaklığı Görüntüle");
            System.out.println("2-Soğutucu Aç");
            System.out.println("3-Soğutucu  Kapat");
            System.out.println("4-Çıkış Yap");
            System.out.println("İşlem seçiniz");
            Scanner scanner = new Scanner(System.in);
            this.islem = scanner.nextInt();
            if(islem==4) devam=false;
            Notify();
        }
    }

    public int getState(){
        return this.islem;
    }
    @Override
    public void attach(IMerkeziIslemBirimi o){
        m.add(o);

    }
    @Override
    public void Notify(){
        for(int i=0;i< m.size();i++){
            m.get(i).update(this);
        }

    }

}
