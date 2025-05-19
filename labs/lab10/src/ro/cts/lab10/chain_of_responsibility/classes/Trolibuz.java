package ro.cts.lab10.chain_of_responsibility.classes;

public class Trolibuz extends Transport{

    @Override
    public void recomanda(int dist) {
        if(dist<=0){
            System.out.println("Distanta introdusa gresit.");
        }
        if(dist<=3){
            System.out.println("Se recomanda Trolibuz");
        } else if (urmator!=null) {
            urmator.setUrmator();
        }
    }
}
