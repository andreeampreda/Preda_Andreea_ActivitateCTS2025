package ro.cts.lab4.clase;

public abstract class Supa {
    private int gramaj;
    private double pretPerSutaGrame;
    private String ingrediente;

    public Supa(int gramaj, double pretPerSutaGrame, String ingrediente) {
        this.gramaj = gramaj;
        this.pretPerSutaGrame = pretPerSutaGrame;
        this.ingrediente = ingrediente;
    }

    public double getPretPerSutaGrame() {
        return pretPerSutaGrame;
    }

    public abstract void preparareSupe();
    public double calculPret(){
        return pretPerSutaGrame/100*gramaj;
    }

}
