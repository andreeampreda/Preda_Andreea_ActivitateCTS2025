package composite.main;

import composite.clase.Departament;
import composite.clase.IStructura;
import composite.clase.Sectie;

public class Main {
    public static void main(String[] args) {
        IStructura dep1=new Departament("ORL");
        IStructura dep2=new Departament("Cardiologie");

        IStructura sect1=new Sectie("sectia 1");
        IStructura sect2=new Sectie("sectia 2");


    }
}
