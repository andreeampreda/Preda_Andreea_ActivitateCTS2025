package ro.cts.lab6.classes;

public class Farmacie {
    private String numeFarmacie;

    public Farmacie(String numeFarmacie) {
        this.numeFarmacie = numeFarmacie;
    }

    public void vindeMedicament(IMedicamentFarmacie medicamentFarmacie){
        System.out.println("Farmacie "+ numeFarmacie+" va ofera medicamentul");
        medicamentFarmacie.cumparaMedicamet();
    }
}
