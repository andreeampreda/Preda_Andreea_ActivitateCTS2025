package spital.program;

import spital.classes.Adaptor;
import spital.classes.Farmacie;
import spital.classes.IMedicamentFarmacie;
import spital.classes.MedicamentFarmacie;

public class Program {

    public static void main(String[] args) {
        Farmacie farmacie=new Farmacie("DrMax");
        IMedicamentFarmacie medicamentFarmacie =new MedicamentFarmacie(10,"Paracetamol", true);
        farmacie.vindeMedicament(medicamentFarmacie);

        Adaptor adaptor=new Adaptor(20,"Parasinus");
        farmacie.vindeMedicament(adaptor);
    }
}
