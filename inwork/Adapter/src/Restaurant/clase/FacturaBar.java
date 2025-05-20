package Restaurant.clase;

public class FacturaBar extends Bar implements Factura{
    public FacturaBar(float pret, boolean areAlcool) {
        super(pret, areAlcool);
    }

    @Override
    public float calculeazaNota() {
        return super.calculeazaNota();
    }

    @Override
    public void scoateBon() {
        System.out.println("Aveti de platit "+ this.calculeazaNota() + " lei");
    }
}
