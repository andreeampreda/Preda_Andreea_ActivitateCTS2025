package ro.cts.lab4.clase;

public class SupaLegume extends Supa{
    private double gramajCrutoane;
    public SupaLegume(int gramaj, double pretPerSutaGrame, String ingrediente, double gramajCrutoane) {
        super(gramaj, pretPerSutaGrame, ingrediente);
        this.gramajCrutoane=gramajCrutoane;
    }

    @Override
    public void preparareSupe() {
        System.out.println("Timp de preparare 20 minute.");
    }

    @Override
    public double calculPret() {
        return super.calculPret()+gramajCrutoane/2/100*getPretPerSutaGrame();
    }
}
