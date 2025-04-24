package ro.cts.lab1.clase;

import ro.cts.lab1.interfete.IPersoana;

public abstract  class Persoana implements IPersoana {
    private String nume;
    protected int varsta;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public Persoana(){
        nume="";
        varsta=0;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        varsta = varsta;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }

    public abstract float calculareVenit();
}
