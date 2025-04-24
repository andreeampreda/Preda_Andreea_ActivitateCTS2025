package restaurant.clase;

public abstract class MeniuComponent {
    private String nume;

    public MeniuComponent(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public abstract void adauga(MeniuComponent component);
    abstract void sterge(MeniuComponent component);
    abstract MeniuComponent getItem(int index);
    abstract void afiseazaDescriere();
}
