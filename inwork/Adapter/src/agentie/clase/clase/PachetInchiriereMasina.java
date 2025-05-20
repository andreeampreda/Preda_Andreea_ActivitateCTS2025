package agentie.clase.clase;

import agentie.clase.inchirieremasini.Masina;
import agentie.clase.inchirieremasini.MasinaInchiriata;

public class PachetInchiriereMasina extends MasinaInchiriata implements PachetTuristic {

    public PachetInchiriereMasina(Masina masina) {
        super(masina);
    }

    @Override
    public void descriere() {
        System.out.println(super.toString());
    }

    @Override
    public void rezervaPachet() {
        super.inchiriazaMasina();
    }
}
