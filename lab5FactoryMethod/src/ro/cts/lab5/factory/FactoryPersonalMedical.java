package ro.cts.lab5.factory;

import ro.cts.lab5.classes.Angajat;
import ro.cts.lab5.classes.Asistent;
import ro.cts.lab5.classes.Medic;

import static ro.cts.lab5.factory.TipPersonalMedical.ASISTENT;
import static ro.cts.lab5.factory.TipPersonalMedical.MEDIC;

public class FactoryPersonalMedical implements FactoryPersonal{
    private double spor;

    public FactoryPersonalMedical(double spor) {
        this.spor = spor;
    }

    public void setSpor(double spor) {
        this.spor = spor;
    }

    @Override
    public Angajat creareAngajat(TipPersonal tipPersonal, String nume, double salariu) {
        return switch (tipPersonal){
            case ASISTENT-> new Asistent(nume,salariu,spor);
            case MEDIC -> new Medic(nume,salariu,spor);
            default -> null;
        };
    }
}
