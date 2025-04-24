package ro.cts.lab5.program;

import ro.cts.lab5.classes.AbastractBuilder;
import ro.cts.lab5.classes.Pacient;
import ro.cts.lab5.classes.PacientBuilder;

public class Main {
    public static void main(String[] args) {

        PacientBuilder pacientBuilder=new PacientBuilder("Alex");
        Pacient pacient= pacientBuilder.setNumeInsotitor("Alexa").setAreHalat(true).getPacient();
        System.out.println(pacient.toString());

        Pacient pacient1=pacientBuilder.setNumeInsotitor("Insotitor2").setAreMicDeJun(true).getPacient();
        System.out.println(pacient.toString());
        System.out.println(pacient1.toString());
    }
}