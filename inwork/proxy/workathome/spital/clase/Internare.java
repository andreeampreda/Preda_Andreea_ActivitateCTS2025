package spital.clase;

public class Internare implements IInternare{

    private String diagnostic;
    private Pacient pacient;

    public Internare(String diagnostic, Pacient pacient) {
        this.diagnostic = diagnostic;
        this.pacient = pacient;
    }

    public Pacient getPacient() {
        return pacient;
    }

    @Override
    public void inregistrareInternare() {
        System.out.println("Pacientul " + pacient.getNume()+" este internat.");
    }
}
