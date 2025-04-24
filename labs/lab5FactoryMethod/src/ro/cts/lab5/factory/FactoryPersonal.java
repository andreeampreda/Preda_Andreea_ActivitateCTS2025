package ro.cts.lab5.factory;

import ro.cts.lab5.classes.Angajat;

public interface FactoryPersonal {

    Angajat creareAngajat(TipPersonal tipPersonal, String nume, double salariu);
}
