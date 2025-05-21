package agentie.clase;

public class ItemMeniu implements OptiuniMeniu{
    private String nume;

    public ItemMeniu(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Este preparatul " + nume);
    }

    @Override
    public void adaugaNod(OptiuniMeniu op) throws Exception {
            throw new Exception("Nu este implementat.");
    }

    @Override
    public void stergeNod(OptiuniMeniu op) throws Exception {
            throw new Exception("Nu este implementat");
    }

    @Override
    public OptiuniMeniu getOptiune(int index) throws Exception {
        throw new Exception("Nu este implementat");
    }
}
