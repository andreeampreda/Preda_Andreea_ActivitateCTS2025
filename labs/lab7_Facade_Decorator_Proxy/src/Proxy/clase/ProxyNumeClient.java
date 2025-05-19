package Proxy.clase;

public class ProxyNumeClient implements IRezervare{

    private IRezervare rezervare;

    public ProxyNumeClient(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizareRezervare(String numeClient, int nrPersoane) {
        if(numeClient.length()>5){
            this.rezervare.realizareRezervare(numeClient,nrPersoane);
        }
        else {
            System.out.println("Nu va este permisa rezervarea.");
        }
    }
}
