package Chain_of_responsibility.clase;

public class Autobuz extends Transport{


    public Autobuz() {
    }

    @Override
    public void recomanda(int dist) {
        if(dist<=5){
            System.out.println("Se recomanda sa iei Autobuzul");
        }
        else if(urmator!=null) {
            urmator.recomanda(dist);

        }
    }
}
