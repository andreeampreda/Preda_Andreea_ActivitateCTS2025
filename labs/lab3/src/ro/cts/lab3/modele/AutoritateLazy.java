package ro.cts.lab3.modele;

public class AutoritateLazy {
    private String denumire;
    private String website;
    private  int nrAngajati;
    private int nrAutorizatiEmise;

    private static AutoritateLazy instance=null;

    private AutoritateLazy(String denumire, String website, int nrAngajati, int nrAutorizatiEmise) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
        this.nrAutorizatiEmise = nrAutorizatiEmise;
    }

    public static synchronized AutoritateLazy getInstance(){
        if(instance==null){
            instance=new AutoritateLazy("ANPA","www.anpa.ro", 100,1000);
        }

        return instance;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritateLazy{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append(", nrAutorizatiEmise=").append(nrAutorizatiEmise);
        sb.append('}');
        return sb.toString();
    }

    public void angajeaza(int nrAngajatiNoi) {
        this.nrAngajati += nrAngajatiNoi;
    }

    public void concediaza (int nrAngajatiConcediati) {
        this.nrAngajati -= nrAngajatiConcediati;
    }

    public void emiteAutorizatie(String numePersoana) {
        System.out.println("S-a emis o autorizatie pentru " + numePersoana);
        this.nrAutorizatiEmise++;
    }
}
