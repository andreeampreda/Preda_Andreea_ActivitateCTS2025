package Hotel.main;

import Hotel.clase.ProxyRezervare;
import Hotel.clase.Rezervare;

public class Program {
    public static void main(String[] args) {
        Rezervare rezervare=new Rezervare(12,1234);
        rezervare.anulareRezervare();

        ProxyRezervare proxyRezervare=new ProxyRezervare(rezervare);
        proxyRezervare.anulareRezervare();
    }
}
