package edu.sau.vys.vys1;
import java.io.IOException;
import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException  {
        AgArayuzu agArayuzu=new AgArayuzu();
        MerkeziIslemBirimi m = new MerkeziIslemBirimi();
        agArayuzu.attach(m);
        try{
            agArayuzu.islemSeciniz();
        }catch (Exception e){

        }

      }
}

