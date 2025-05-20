package Agentie.clase;

public abstract class Decorator implements PachetTuristic{
    private PachetTuristic pachetTuristic;

    public Decorator(PachetTuristic pachetTuristic) {
        this.pachetTuristic = pachetTuristic;
    }

    @Override
    public void descriere() {
        pachetTuristic.descriere();
    }

    public abstract void anulareRezervare();
}
