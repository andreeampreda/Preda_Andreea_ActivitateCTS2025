package Spital.main;

import Spital.clase.Decorator;
import Spital.clase.IRezultat;
import Spital.clase.Rezultate;
import Spital.clase.RezultateOnline;

public class Main {
    public static void main(String[] args) {

        IRezultat rezultat=new Rezultate("Ana");
        System.out.println(rezultat.transmiteRezultate());

        Decorator rez=new RezultateOnline(rezultat);
        System.out.println(rez.transmiteRezultate());
    }
}