package edu.sau.vys.vys1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Person implements IPerson {

    private  String ad;
    private String soyad;
    private String kullaniciAdi;
    private String sifre;
    private VeritabaniBaglanti veritabaniBaglanti;
    public Person() throws SQLException {
        veritabaniBaglanti = new VeritabaniBaglanti();
        sistemeGiris();
    }
    @Override
    public void sistemeGiris() throws SQLException {
        System.out.println("************************Soğutucu Sistemine Hoşgeldiniz**********************************");
        System.out.println("************************Devam Etmek için Kullanıcı Adınızı ve şifrenizi Giriniz**********************************");
        boolean durum= true;
        while (durum){
            try{
                setKullaniciAdi();
                setSifre();
                if(!kontrol()) durum=false;
            }catch (Exception e){

            }

        }

    }
    private void setKullaniciAdi(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kullanici Adinizi Giriniz.....");
        this.kullaniciAdi=scanner.nextLine();
    }
    private void setSifre(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sifrenizi Giriniz.....");
        this.sifre=scanner.nextLine();
    }
    @Override
    public String getAd(){
        return this.ad;
    }
    @Override
    public String getSoyad(){
        return this.soyad;
    }
    private boolean kontrol() throws SQLException {
        boolean hata=true;
        ResultSet rs = veritabaniBaglanti.kisi(this.kullaniciAdi,this.sifre);
        rs.next();
         try{
            if(rs.getString("KullaniciAdi").equals(this.kullaniciAdi) && rs.getString("sifre").equals(this.sifre)){
                this.ad=rs.getString("Ad");
                this.soyad=rs.getString("soyad");
                hata=false;
            }
         }catch (Exception e){
             System.out.println("Kullanici Adi ve ya Şifre Hatalı");
         }
         return hata;

    }



}
