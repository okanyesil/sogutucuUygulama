package edu.sau.vys.vys1;

import java.sql.SQLException;

public interface IPerson  {
    public void sistemeGiris() throws SQLException;
    public String getAd();
    public String getSoyad();
}
