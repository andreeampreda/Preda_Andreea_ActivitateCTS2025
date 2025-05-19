package ro.cts.lab10.chain_of_responsibility.classes;

public class Autobuz extends Transport{
    @Override
    public void recomanda(int dist) {
        if(dist<=5){
            System.out.println("Se recomanda sa iei Autobuzul");
        }
        else if(urmator!=null) {


        }
    }
}
