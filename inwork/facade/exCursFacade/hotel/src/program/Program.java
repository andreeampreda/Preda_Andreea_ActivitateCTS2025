package program;

import clase.Facade;

public class Program {
    public static void main(String[] args) {
        int codCamera=6;
        System.out.println(Facade.verificareDisponibilitateCamera(codCamera));

    }
}
