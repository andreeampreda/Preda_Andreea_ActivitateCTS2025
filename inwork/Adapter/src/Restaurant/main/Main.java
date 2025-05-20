package Restaurant.main;

import Restaurant.clase.Factura;
import Restaurant.clase.FacturaBar;
import Restaurant.clase.FacturaRestaurant;

public class Main {
    public static void main(String[] args) {
        Factura facturaRestaurant=new FacturaRestaurant(12,2);
        Factura facturaBar=new FacturaBar(10,true);

        facturaRestaurant.scoateBon();
        facturaBar.scoateBon();
    }
}
