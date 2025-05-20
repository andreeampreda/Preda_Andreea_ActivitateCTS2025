package Chain_of_responsibility.clase;

public class Metrou extends Transport{

    public Metrou() {
    }

    @Override
    public void recomanda(int dist) {
        System.out.println("Se recomanda Metrou.");
    }
}
