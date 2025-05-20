package Chain_of_responsibility.clase;

public class Tramvai extends Transport{

    public Tramvai() {
    }

    @Override
    public void recomanda(int dist) {
        if(dist<10){
            System.out.println("Se recomanda tramvai.");
        }else if (urmator!=null){
            urmator.recomanda(dist);
        }
    }
}
