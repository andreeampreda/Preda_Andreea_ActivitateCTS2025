package Strategy.main;

import Strategy.clase.Calator;
import Strategy.clase.CardCalatorie;
import Strategy.clase.IMetodaPlata;
import Strategy.clase.PlataSMS;

public class Main {
    public static void main(String[] args) {
        IMetodaPlata cardCalatorie=new CardCalatorie(2);
        IMetodaPlata platesteSMS=new PlataSMS();

        Calator calator=new Calator("Maria");
        calator.platesteCalatorie(3);

        calator.setMetodaPlata(cardCalatorie);
        calator.platesteCalatorie(3);
        calator.platesteCalatorie(3);
        calator.platesteCalatorie(3);

        calator.setMetodaPlata(platesteSMS);
        calator.platesteCalatorie(3);
    }
}
