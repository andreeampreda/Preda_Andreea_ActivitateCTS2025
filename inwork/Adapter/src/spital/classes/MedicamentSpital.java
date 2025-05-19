package spital.classes;

public class MedicamentSpital {
    private float pret;
    private String nume;

    public MedicamentSpital(float pret, String nume) {
        this.pret = pret;
        this.nume = nume;
    }

    public float getPret() {
        return pret;
    }

    public String getNume() {
        return nume;
    }

    public void achizitioneazaMedicament(){
        System.out.println("Medicamentul " + nume +" este cumparat la pretul " + pret);
    }

    public void prezintaReteta(){
        System.out.println("Este prezentata reteta pentru medicamentul "+ nume );
    }


}
