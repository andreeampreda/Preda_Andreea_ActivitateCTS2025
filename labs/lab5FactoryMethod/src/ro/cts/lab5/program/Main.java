package ro.cts.lab5.program;

import ro.cts.lab5.classes.Angajat;
import ro.cts.lab5.factory.FactoryPersonalMedical;
import ro.cts.lab5.factory.FactoryPersonalNonMedical;
import ro.cts.lab5.factory.TipPersonalMedical;
import ro.cts.lab5.factory.TipPersonalNonMedical;

public class Main {
    public static void main(String[] args) {
        FactoryPersonalMedical factoryPersonalMedical=new FactoryPersonalMedical(10.5);
        Angajat medic = factoryPersonalMedical.creareAngajat(TipPersonalMedical.MEDIC,"geo",12000);

        factoryPersonalMedical.setSpor(15);
        Angajat asistent = factoryPersonalMedical.creareAngajat(TipPersonalMedical.ASISTENT,"dora",9200);

        System.out.println(medic.toString());
        System.out.println(asistent.toString());

        FactoryPersonalNonMedical factoryPersonalNonMedical = new FactoryPersonalNonMedical(10);
        Angajat portar = factoryPersonalNonMedical.creareAngajat(TipPersonalNonMedical.PORTAR,"doru",4000);
        factoryPersonalNonMedical.setVechime(30);
        Angajat secretar = factoryPersonalNonMedical.creareAngajat(TipPersonalNonMedical.SECRETAR,"ANA",5000);

        System.out.println(portar);
        System.out.println(secretar);
    }
}