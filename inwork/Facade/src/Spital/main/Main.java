package Spital.main;

import Spital.clase.Pacient;
import Spital.clase.Salon;
import Spital.clase.Facade;

public class Main {
    public static void main(String[] args) {

        Pacient pacient = new Pacient("Ion Popescu", 4);
        Salon salon = new Salon(101, true);

        Facade facade = new Facade();
        facade.verificarePacient(pacient, salon);
    }
}
