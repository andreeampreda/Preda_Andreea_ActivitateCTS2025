package ro.cts.lab5.factory;

import ro.cts.lab5.classes.Angajat;
import ro.cts.lab5.classes.Portar;
import ro.cts.lab5.classes.Secretar;

public class FactoryPersonalNonMedical implements FactoryPersonal{
    private int vechime;

    public FactoryPersonalNonMedical(int vechime) {
        this.vechime = vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    @Override
    public Angajat creareAngajat(TipPersonal tipPersonal, String nume, double salariu) {
        return switch (tipPersonal){
            case TipPersonalNonMedical.SECRETAR -> new Secretar(nume,salariu,vechime);
            case TipPersonalNonMedical.PORTAR -> new Portar(nume,salariu,vechime);
            default -> null;
        };
    }


}
