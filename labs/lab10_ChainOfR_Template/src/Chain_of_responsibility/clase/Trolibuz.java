package Chain_of_responsibility.clase;

public class Trolibuz extends Transport{

    public Trolibuz() {
    }

    @Override
    public void recomanda(int dist) {
        if(dist<=0){
            System.out.println("Distanta introdusa gresit.");
        }
        if(dist<=3){
            System.out.println("Se recomanda Trolibuz");
        } else if (urmator!=null) {
            urmator.recomanda(dist);
        }
    }
}
