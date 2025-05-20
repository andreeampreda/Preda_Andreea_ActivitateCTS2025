package Agentie.main;

import Agentie.clase.Decorator;
import Agentie.clase.OfertaPachetCazare;
import Agentie.clase.PachetCazare;
import Agentie.clase.PachetTuristic;

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachetTuristicCazare=new PachetCazare();
        pachetTuristicCazare.descriere();

        Decorator pachetTuristicOfertaCazare=new OfertaPachetCazare(pachetTuristicCazare);
        pachetTuristicOfertaCazare.anulareRezervare();
    }
}
