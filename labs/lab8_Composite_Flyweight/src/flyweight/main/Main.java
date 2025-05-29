package flyweight.main;

import flyweight.classes.Receptie;
import flyweight.classes.Spitalizare;

public class Main {
    public static void main(String[] args) {
        Receptie receptie=new Receptie();
        Spitalizare s1=new Spitalizare(1,2,3);
        Spitalizare s2=new Spitalizare(2,2,3);
        receptie.getPacient("Ion", "1234","str. Lascar").afisareInformatii(s1);
        receptie.getPacient("Maria", "1234","str. Lascar").afisareInformatii(s2);
        receptie.getPacient("Ana", "1234","str. Lascar");




    }
}
