package Spital.clase;

public class Rezultate implements IRezultat{
    private String name;

    public Rezultate(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String transmiteRezultate() {
        return  "Pacientul " + getName()+ " a primit rezultatele.";
    }
}
