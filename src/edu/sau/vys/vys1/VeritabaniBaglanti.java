package edu.sau.vys.vys1;

import java.sql.*;
public class VeritabaniBaglanti implements IVeritabaniBaglanti {
    private Connection conn;
    public VeritabaniBaglanti() throws SQLException {
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/admin",
                "postgres", "postgres");
        if (conn != null)
            System.out.println("Ağa bağlandı!");
        else
          System.out.println("Bağlantı girişimi başarısız!");

    }
    @Override
    public ResultSet kisi(String ad,String sifre) throws SQLException {
        String query="select \"Ad\", \"soyad\",\"KullaniciAdi\",\"Sifre\" from \"kullaniciBilgileri\" where \"KullaniciAdi\" = '"+ad+"' and \"Sifre\" ='"+sifre+"'";
        ResultSet rs=null;
        Statement stm = null;
        try {
            stm = conn.createStatement();
             rs=stm.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;
    }




}
