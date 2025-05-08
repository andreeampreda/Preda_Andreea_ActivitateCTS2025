package ro.cts.lab8.composite.main;

import ro.cts.lab8.composite.classes.Departament;
import ro.cts.lab8.composite.classes.IStructura;
import ro.cts.lab8.composite.classes.Sectie;

public class Main {
    public static void main(String[] args) {
        IStructura dep1=new Departament("ORL");
        IStructura dep2=new Departament("Cardiologie");

        IStructura sect1=new Sectie("sectia 1");
        IStructura sect2=new Sectie("sectia 2");


    }
}
