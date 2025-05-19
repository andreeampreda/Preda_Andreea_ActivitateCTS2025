package Spital.main;

import Spital.clase.Facade;
import Spital.clase.Pacient;
import Spital.clase.Salon;
import Spital.clase.Spital;

public class Main {
    public static void main(String[] args) {

        Pacient pacient=new Pacient("Alex",5);
        Pacient pacient1=new Pacient("Marius", 2);

        Spital spital=new Spital();

        spital.internarePacient(pacient);
        spital.internarePacient(pacient1);
    }
}
