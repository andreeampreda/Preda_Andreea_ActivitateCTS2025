package ro.cts.lab5.classes;

public class Medic extends Angajat{
    private double vechime;

    public Medic(String nume, double salariu, double vechime) {
        super(nume, salariu);
        this.vechime = vechime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append("vechime=").append(vechime);
        sb.append('}');
        return sb.toString();
    }
}
