package restaurant.clase;

public class Rezervare implements IRezervare{

    private String numePersoana;
    private int nrPersoane;

    public Rezervare(String numePersoana, int nrPersoane) {
        this.numePersoana = numePersoana;
        this.nrPersoane = nrPersoane;
    }

    public String getNumePersoana() {
        return numePersoana;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    @Override
    public void permiteRezervare() {
        System.out.println("Rezervare realizata cu succes");
    }
}
