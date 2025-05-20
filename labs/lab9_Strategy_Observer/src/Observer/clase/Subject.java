package Observer.clase;

public interface Subject {
    void adaugaObserver(Observer obeserver);
    void stergeObserver(Observer observer);
    void trimiteMesaj(String nume);
}
