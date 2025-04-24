package ro.cts.lab6.classes;

public class AdapterDeClase extends MedicamentSpital implements IMedicamentFarmacie{
    public AdapterDeClase(float pret, String nume) {
        super(pret, nume);
    }

    @Override
    public void cumparaMedicamet() {
        super.achizitioneazaMedicament();
    }
}
