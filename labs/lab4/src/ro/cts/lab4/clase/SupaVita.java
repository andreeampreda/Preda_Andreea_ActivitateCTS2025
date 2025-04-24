package ro.cts.lab4.clase;

public class SupaVita extends Supa{
    private double pretSmantana;

    public SupaVita(int gramaj, double pretPerSutaGrame, String ingrediente, double pretSmantana) {
        super(gramaj, pretPerSutaGrame, ingrediente);
        this.pretSmantana = pretSmantana;
    }

    @Override
    public void preparareSupe() {
        System.out.println("Timp de preparare 45 minute.");
    }

    @Override
    public double calculPret() {
        return super.calculPret()+pretSmantana;
    }
}
