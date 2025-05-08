package ro.cts.lab8.composite.classes;

import java.util.ArrayList;
import java.util.List;

public class Departament implements  IStructura{
    private  String nume;
    private List<IStructura> lista;

    public Departament(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<IStructura> getLista() {
        return lista;
    }

    public void setLista(List<IStructura> lista) {
        this.lista = lista;
    }

    @Override
    public void drescriereStructura() {
        System.out.println("Departametul "+nume+" are urmatoarele subdepartamente/sectii");
        for(IStructura structura: lista){
            structura.drescriereStructura();
        }
    }

    @Override
    public void adaugaNod(IStructura structura) throws Exception {
        lista.add(structura);
    }

    @Override
    public void stergeNod(IStructura structura) throws Exception {
        lista.remove(structura);
    }

    @Override
    public IStructura getNodCopil(int index) {
        return  lista.get(index);
    }
}
