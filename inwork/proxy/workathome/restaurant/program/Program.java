package restaurant.program;

import restaurant.clase.ProxyRezervare;
import restaurant.clase.Rezervare;

public class Program {
    public static void main(String[] args) {
        Rezervare rezervare=new Rezervare("Maria", 2);
        rezervare.permiteRezervare();

        ProxyRezervare proxyRezervare=new ProxyRezervare(rezervare);
        proxyRezervare.permiteRezervare();
    }
}
