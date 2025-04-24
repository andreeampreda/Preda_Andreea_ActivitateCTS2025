package ro.cts.lab4.Rezervare;

public class RezervarePrincipal extends Rezervare{

    public RezervarePrincipal(String numeClient, int nrPersoane, String ora, String data) {
        super(numeClient, nrPersoane, ora, data);
    }

    @Override
    public void descriere() {
        System.out.println("O rezervare noua.");
    }

    @Override
    public Rezervare copiaza() {
        RezervarePrincipal rezervare=new RezervarePrincipal();


        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervarePrincipal{");
        sb.append('}');
        return sb.toString();
    }
}
