package ro.cts.lab8.flyweight.main;

import ro.cts.lab8.flyweight.classes.IPacient;
import ro.cts.lab8.flyweight.classes.Receptie;
import ro.cts.lab8.flyweight.classes.Spitalizare;

public class Main {
    public static void main(String[] args) {
        Receptie receptie=new Receptie();
        receptie.getPacient("Ion", "1234","str. Lascar");
        receptie.getPacient("Maria", "1234","str. Lascar");
        receptie.getPacient("Ana", "1234","str. Lascar");

        Spitalizare s1=new Spitalizare(1,2,3);
        Spitalizare s2=new Spitalizare(2,2,3);



    }
}
