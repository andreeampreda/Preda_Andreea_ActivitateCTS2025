package restaurant.clase;

public class ProxyRezervare implements IRezervare{
    private Rezervare rezervare;

    public ProxyRezervare(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void permiteRezervare() {
        if(rezervare.getNrPersoane()>=4){
            System.out.println("Rezervare este realizata cu succes pe numele "+rezervare.getNumePersoana());
        }else {
            System.out.println("Clientul "+rezervare.getNumePersoana()+" este rugat sa vina la restaurant, \n sunt suficiente mese libere pentru 2 persoane in locatie.");
        }
    }
}
