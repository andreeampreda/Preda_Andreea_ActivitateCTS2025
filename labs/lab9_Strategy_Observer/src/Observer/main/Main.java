package Observer.main;

import Observer.clase.*;

public class Main {
    public static void main(String[] args) {

        MijlocTransport transport=new Autobuz(1);

         Observer persoana1=new Calator("Marius");
         Observer persoana2=new Calator("Maria");
         Observer persoana3=new Calator("Mihai");

         transport.adaugaObserver(persoana1);
         transport.adaugaObserver(persoana2);
         transport.adaugaObserver(persoana3);

         transport.trimiteMesaj("pleaca din statie");

         transport.pleacaDeLaCapata();
         transport.stergeObserver(persoana2);
        ((Autobuz)transport).schimbaTraseul();
    }
}