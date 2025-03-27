package ro.cts.lab4.clase;

public class SupaCiuperci extends Supa{

    private double cantitateCiuperci;

    public SupaCiuperci(int gramaj, double pretPerSutaGrame, String ingrediente, double cantitateCiuperci) {
        super(gramaj, pretPerSutaGrame, ingrediente);
        this.cantitateCiuperci=cantitateCiuperci;

    }

    @Override
    public void preparareSupe() {
        System.out.println("Timp de preparare 30 de minute.");
    }

    @Override
    public double calculPret() {
        return super.calculPret()+cantitateCiuperci/100*getPretPerSutaGrame();
    }
}
