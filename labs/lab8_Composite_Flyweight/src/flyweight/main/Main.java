package flyweight.main;

import flyweight.classes.Receptie;
import flyweight.classes.Spitalizare;

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
