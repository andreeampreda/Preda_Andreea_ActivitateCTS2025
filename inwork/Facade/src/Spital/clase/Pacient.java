package Spital.clase;

public class Pacient {
    private String nume;
    private int stare;
    //se va alege o stare de la 1 la 5
    //1 fiind cea mai usoara 5 ce mai grea


    public Pacient(String nume, int stare) {
        this.nume = nume;
        this.stare = stare;
    }

    public String getNume() {
        return nume;
    }

    public int getStare() {
        return stare;
    }
}
