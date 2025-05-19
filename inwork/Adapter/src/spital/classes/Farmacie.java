package spital.classes;

public class Farmacie {
    private String numeFarmacie;

    public Farmacie(String numeFarmacie) {
        this.numeFarmacie = numeFarmacie;
    }

    public void vindeMedicament(IMedicamentFarmacie medicamentFarmacie){
        System.out.println("Farmcaie "+numeFarmacie+"va ofera medicamentul");
        medicamentFarmacie.cumparaMedicament();
    }
}
