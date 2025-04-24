package spital.clase;

public class ProxyInternare implements IInternare{

    private Internare internare;

    public ProxyInternare(Internare internare) {
        this.internare = internare;
    }

    @Override
    public void inregistrareInternare() {
        if(internare.getPacient().isAreAsigurare()){
            System.out.println("Pacientul " + internare.getPacient().getNume()+" este internat.");
        }else {
            System.out.println("Pactientul "+ internare.getPacient().getNume()+" nu poate fi internate, acesta nu detine asigurare medicala.");
        }
    }
}
