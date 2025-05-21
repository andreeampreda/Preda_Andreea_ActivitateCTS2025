package agentie.clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements OptiuniMeniu{
    private String nume;
    private List<OptiuniMeniu> list;

    public Categorie(String nume) {
        this.nume = nume;
        this.list=new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<OptiuniMeniu> getList() {
        return list;
    }

    public void setList(List<OptiuniMeniu> list) {
        this.list = list;
    }

    @Override
    public void descriere() {
        System.out.println("Categoria: " + nume + " are urmatoarele preparate disponibile");
        for (OptiuniMeniu item : list){
            item.descriere();
        }
    }

    @Override
    public void adaugaNod(OptiuniMeniu op) {
        list.add(op);
    }

    @Override
    public void stergeNod(OptiuniMeniu op) {
            list.remove(op);
    }

    @Override
    public OptiuniMeniu getOptiune(int index) {
        return list.get(index);
    }
}
