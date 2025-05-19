package agentie.clase.clase;

import agentie.clase.clase.PachetTuristic;

public class PachetCazare implements PachetTuristic {
    @Override
    public void descriere() {
        System.out.println("Acest pachet include doar cazare.");
    }

    @Override
    public void rezervaPachet() {
        System.out.println("A fost realizata o rezervare de cazare.");
    }
}
