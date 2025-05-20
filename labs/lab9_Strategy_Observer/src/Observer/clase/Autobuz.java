package Observer.clase;

public class Autobuz extends MijlocTransport{
    public Autobuz(int nrLinie) {
        super(nrLinie);
    }

    @Override
    public void pleacaDeLaCapata() {
        trimiteMesaj("Autobuzul nr " + this.getNrLinie() + "pleaca de la capatul liniei.");
    }

    public void schimbaTraseul(){
        trimiteMesaj("Autobuzul numarul " + this.getNrLinie() + " va circula astazi prin Bd. Balcescu si nu va mai opri la statia Piata Romana");
    }
}
