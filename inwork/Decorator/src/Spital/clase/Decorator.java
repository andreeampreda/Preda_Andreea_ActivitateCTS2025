package Spital.clase;

public abstract class Decorator implements IRezultat{
    private IRezultat rezultat;

    public Decorator(IRezultat rezultat) {
        this.rezultat = rezultat;
    }

    @Override
    public String transmiteRezultate() {
       return rezultat.transmiteRezultate() + trimisOnline();
    }

    protected abstract String trimisOnline();
}
