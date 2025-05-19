package Proxy.clase;

public class Rezervare implements IRezervare{

    @Override
    public void realizareRezervare(String numeClient, int nrPersoane) {
        System.out.println("Rezervare realizata pentru " + numeClient +" - "+ nrPersoane+" persoane.");
    }
}
