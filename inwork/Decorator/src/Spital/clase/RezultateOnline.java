package Spital.clase;

public class RezultateOnline extends Decorator{
    public RezultateOnline(IRezultat rezultat) {
        super(rezultat);
    }

    @Override
    protected String trimisOnline() {
        return "\n Rezultatele au fost trimise online.";
    }
}
