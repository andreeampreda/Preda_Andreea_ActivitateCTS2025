package Proxy.main;

import Proxy.clase.IRezervare;
import Proxy.clase.ProxyNumeClient;
import Proxy.clase.Rezervare;
import Proxy.clase.RezervareProxy;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare=new Rezervare();
        IRezervare proxy=new RezervareProxy(rezervare);
        proxy.realizareRezervare("Alina",1);
        proxy.realizareRezervare("Inna", 6);

        IRezervare pCompus= new ProxyNumeClient(proxy);
        pCompus.realizareRezervare("Maria", 2);
        pCompus.realizareRezervare("Pop", 5);
    }
}