package Strategy.clase;

public class Calator {
    private String nume;
    private IMetodaPlata metodaPlata;

    public Calator(String nume, IMetodaPlata metodaPlata) {
        this.nume = nume;
        this.metodaPlata = metodaPlata;
    }

    public Calator(String nume) {
        this.nume = nume;
        this.metodaPlata = new CardBancar(10);
    }

    public void setMetodaPlata(IMetodaPlata metodaPlata){
        this.metodaPlata=metodaPlata;
    }

    public void platesteCalatorie(float pretBilet){
        metodaPlata.plateste(pretBilet);
    }
}
