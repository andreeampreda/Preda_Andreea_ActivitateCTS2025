package Spital.clase;


import java.util.List;

public class Salon {
    private int nrSalon;
    private boolean arePaturiLibere;

    public Salon(){

    }

    public Salon(int nrSalon, boolean arePaturiLibere) {
        this.nrSalon = nrSalon;
        this.arePaturiLibere = arePaturiLibere;
    }

    public int getNrSalon() {
        return nrSalon;
    }

    public boolean isArePaturiLibere() {
        return arePaturiLibere;
    }
}
