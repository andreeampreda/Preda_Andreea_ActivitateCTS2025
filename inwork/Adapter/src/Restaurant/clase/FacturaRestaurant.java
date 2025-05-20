package Restaurant.clase;

public class FacturaRestaurant implements Factura{
    private int nrPortii;
    private float pretPerPortie;

    public FacturaRestaurant(int nrPortii, float pretPerPortie) {
        this.nrPortii = nrPortii;
        this.pretPerPortie = pretPerPortie;
    }

    @Override
    public void scoateBon() {
        System.out.println("Aveti de platit " + nrPortii*pretPerPortie + " lei.");
    }
}
