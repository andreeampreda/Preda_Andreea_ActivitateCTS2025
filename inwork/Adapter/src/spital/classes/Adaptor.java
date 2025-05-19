package spital.classes;

public class Adaptor extends MedicamentSpital implements IMedicamentFarmacie{

    public Adaptor(float pret, String nume) {
        super(pret, nume);
    }

    @Override
    public void cumparaMedicament() {
        super.achizitioneazaMedicament();
    }
}
