package Agentie.clase;

public class OfertaPachetCazare extends Decorator{

    public OfertaPachetCazare(PachetTuristic pachetTuristic) {
        super(pachetTuristic);
    }

    @Override
    public void anulareRezervare() {
        System.out.println("Rezervarea de cazare a fost anulata.");
    }
}
