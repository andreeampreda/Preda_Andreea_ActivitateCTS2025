package agentie.clase.inchirieremasini;

public class MasinaInchiriata {
    private Masina masina;

    public MasinaInchiriata(Masina masina) {

        this.masina = masina;
    }

    public void inchiriazaMasina(){
        System.out.println("A fost inchiriata masina " + masina.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetMasinaInchiriata{");
        sb.append("masina=").append(masina);
        sb.append('}');
        return sb.toString();
    }
}
