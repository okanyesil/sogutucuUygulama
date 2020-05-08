package edu.sau.vys.vys1;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface IVeritabaniBaglanti {
    public ResultSet kisi(String ad,String sifre) throws SQLException;

}
