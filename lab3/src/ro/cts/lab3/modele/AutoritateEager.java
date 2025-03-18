package ro.cts.lab3.modele;

public class AutoritateEager {
    private String denumire;
    private String website;
    private  int nrAngajati;
    private int nrAutorizatiEmise;

    private static AutoritateEager instance=new AutoritateEager("ANPA","www.anpa.ro",100,1000);

    public AutoritateEager(String denumire, String website, int nrAngajati, int nrAutorizatiEmise) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
        this.nrAutorizatiEmise = nrAutorizatiEmise;
    }

    public static AutoritateEager getInstance(){
        return instance;
    }

    public String getDenumire() {
        return denumire;
    }

    public String getWebsite() {
        return website;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritateEager{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append(", nrAutorizatiEmise=").append(nrAutorizatiEmise);
        sb.append('}');
        return sb.toString();
    }

    public void anagajeaza(int nrAngajatiNoi) {
        this.nrAngajati += nrAngajatiNoi;
    }

    public void concediaza(int nrAngajatiConcediati){
        this.nrAngajati-=nrAngajatiConcediati;
    }

    public void emiteAutorizatie(String numePersoana){
        System.out.println("S-a emis o autorizatie pentru " + numePersoana);
        this.nrAutorizatiEmise++;
    }
}
