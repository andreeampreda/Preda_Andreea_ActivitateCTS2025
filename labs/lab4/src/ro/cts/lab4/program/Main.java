package ro.cts.lab4.program;

import ro.cts.lab4.clase.Supa;
import ro.cts.lab4.factory.Factory;
import ro.cts.lab4.factory.TipuriSupe;

public class Main {
    public static void main(String[] args) {

        Factory fabrica1=new Factory(200, 10);
        Supa supa=fabrica1.getSupa(TipuriSupe.LEGUME, 100, "Bors, legume");
        supa.preparareSupe();
        Supa supa1=fabrica1.getSupa(TipuriSupe.VITE, 150, "Vita");
        supa1.preparareSupe();
        Supa supa2=fabrica1.getSupa(TipuriSupe.CIUPERCI, 140, "Smantana");
        supa2.preparareSupe();

    }
}