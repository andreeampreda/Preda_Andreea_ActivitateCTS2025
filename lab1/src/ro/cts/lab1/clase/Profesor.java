package ro.cts.lab1.clase;

import ro.cts.lab1.interfete.IPredabil;

public class Profesor extends Persoana implements IPredabil {

    private int idPersoana;
    private float salariu;
    private float sporVechime;

    public Profesor() {
        super("Prof", 35);
        this.idPersoana = 0;
        this.salariu = 0;
        this.sporVechime = 0;
    }

    public Profesor(String nume, int varsta, int idPersoana, float salariu, float sporVechime) {
        super(nume, varsta);
        this.idPersoana = idPersoana;
        this.salariu = salariu;
        this.sporVechime = sporVechime;
    }

    public int getIdPersoana() {
        return idPersoana;
    }

    public void setIdPersoana(int idPersoana) {
        this.idPersoana = idPersoana;
    }

    public float getSalariu() {
        return salariu;
    }

    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }

    public float getSporVechime() {
        return sporVechime;
    }

    public void setSporVechime(float sporVechime) {
        this.sporVechime = sporVechime;
    }

    @Override
    public void preda() {
        StringBuilder sb=new StringBuilder("Profesorul");
        sb.append(this.getNume()).append(" in varsta de ").append(this.varsta).append(" preda la curs");
        System.out.println(sb.toString());
    }

    @Override
    public float calculareVenit() {
        return salariu+sporVechime*salariu;
    }


}
