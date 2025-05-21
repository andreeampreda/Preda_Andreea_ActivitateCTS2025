package agentie.main;

import agentie.clase.Categorie;
import agentie.clase.ItemMeniu;
import agentie.clase.OptiuniMeniu;

public class Main {
    public static void main(String[] args) {
        OptiuniMeniu Bauturi=  new Categorie("Bauturi");
        OptiuniMeniu Paste= new Categorie("Paste");

        OptiuniMeniu apa=new ItemMeniu("apa");
        OptiuniMeniu suc=new ItemMeniu("suc");
        OptiuniMeniu cafea=new ItemMeniu("cafea");
        OptiuniMeniu bere=new ItemMeniu("bere");

        OptiuniMeniu carbonara=new ItemMeniu("carbonara");
        OptiuniMeniu amatriciana=new ItemMeniu("amatriciana");
        OptiuniMeniu quatroFormaggi=new ItemMeniu("quatro formaggi");

        try {
            Bauturi.adaugaNod(apa);
            Bauturi.adaugaNod(suc);
            Bauturi.adaugaNod(cafea);
            Bauturi.adaugaNod(bere);

            Paste.adaugaNod(carbonara);
            Paste.adaugaNod(amatriciana);
            Paste.adaugaNod(quatroFormaggi);

            Bauturi.descriere();
            Paste.descriere();

            Paste.stergeNod(carbonara);
            Paste.descriere();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
