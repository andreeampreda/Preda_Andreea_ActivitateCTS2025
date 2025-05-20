package Template.main;

import Template.clase.AMetrou;
import Template.clase.Metrou;
import Template.clase.MetrouSpecial;

public class Main {
    public static void main(String[] args) {
        AMetrou metrou=new Metrou(15);
        AMetrou metrouS=new MetrouSpecial();

        metrou.circulaRetur();
        metrouS.circulaTur();

        metrou.circulaTur();
        metrouS.circulaRetur();
    }
}
