package ro.cts.lab1.clase;

import ro.cts.lab1.interfete.IPredabil;

public class Asistent extends Persoana implements IPredabil {
    private int idAsistent;
    private float salariu;

    public Asistent(String nume, int varsta, int idAsistent, float salariu) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
        this.salariu = salariu;
    }

    @Override
    public void setNume(String nume) {
        super.setNume(nume);
    }



    @Override
    public void preda() {

    }

    @Override
    public float calculareVenit() {
        return 0;
    }
}
