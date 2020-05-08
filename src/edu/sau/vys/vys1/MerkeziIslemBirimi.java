package edu.sau.vys.vys1;


import java.text.DecimalFormat;

public class MerkeziIslemBirimi implements IMerkeziIslemBirimi {
    private ISicaklikSensoru sensor;
    private IEyleyici eyleyici;
    public MerkeziIslemBirimi() {
         sensor = SicaklikSensoru.getInstance();
         eyleyici = Eyleyici.getInstance();
    }
    @Override
    public void update(Object o){
        if(o instanceof AgArayuzu){
            AgArayuzu ag =(AgArayuzu) o;
            switch (ag.getState()){
                case 1:
                    getSicaklik();

                    break;
                case 2:
                    eyleyici.sogutucuAc();
                    break;
                case  3:
                    eyleyici.sogutucuKapat();
                    break;
                case 4:
                    System.out.println("Yine Bekleriz");
                    break;
                default:
                    System.out.println("Hatalı işlem girdiniz");
            }
        }

    }
    private void getSicaklik(){
        DecimalFormat df2 = new DecimalFormat("#.##");
        System.out.println("Sıcaklık: "+df2.format(sensor.sicaklikDegeral())+" Derece");
    }

}
