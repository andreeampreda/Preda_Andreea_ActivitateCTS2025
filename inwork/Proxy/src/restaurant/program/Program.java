package restaurant.program;

import agentie.clase.ProxyRezervare;
import agentie.clase.Rezervare;

public class Program {
    public static void main(String[] args) {
        Rezervare rezervare=new Rezervare("Maria", 2);
        rezervare.permiteRezervare();

        ProxyRezervare proxyRezervare=new ProxyRezervare(rezervare);
        proxyRezervare.permiteRezervare();
    }
}
