package Observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocTransport implements Subject{
    private int nrLinie;
    private List<Observer> calatori;

    public MijlocTransport(int nrLinie) {
        this.nrLinie = nrLinie;
        this.calatori = new ArrayList<Observer>();
    }

    public int getNrLinie() {
        return nrLinie;
    }

    public List<Observer> getCalatori() {
        return calatori;
    }

    @Override
    public void adaugaObserver(Observer obeserver) {
        calatori.add(obeserver);
    }

    @Override
    public void stergeObserver(Observer observer) {
        calatori.remove(observer);
    }

    @Override
    public void trimiteMesaj(String nume) {
            for(Observer calator : calatori){
                calator.primesteMesaj(nume);
            }
    }

    public abstract void pleacaDeLaCapata();
}
