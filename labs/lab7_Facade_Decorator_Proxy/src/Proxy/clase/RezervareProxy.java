package Proxy.clase;

public class RezervareProxy implements IRezervare{
    private IRezervare rezervare;

    public RezervareProxy(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizareRezervare(String numeClient, int nrPersoane) {
        if(nrPersoane>=4){
            rezervare.realizareRezervare(numeClient, nrPersoane);
        } else {
            System.out.println("Nu este nevoie de rezervare!");

        }
    }
}
