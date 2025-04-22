package ro.cts.lab6.main;

import ro.cts.lab6.classes.AdapterDeClase;
import ro.cts.lab6.classes.Farmacie;
import ro.cts.lab6.classes.IMedicamentFarmacie;
import ro.cts.lab6.classes.MedicamentFarmacie;

public class Main {
    public static void main(String[] args) {

        Farmacie farmacie=new Farmacie("Catena");
        IMedicamentFarmacie medicamentFarmacie=new MedicamentFarmacie(100, "Paracetamol", true);
        farmacie.vindeMedicament(medicamentFarmacie);

        //MedicamentSpital medicamentSpital=new MedicamentSpital(19, "Nurofen");
        AdapterDeClase adapterDeClase=new AdapterDeClase(19, "Nurofen");
        farmacie.vindeMedicament(adapterDeClase);
    }
}