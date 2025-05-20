package Strategy.clase;

public class CardCalatorie implements IMetodaPlata{
    private int nrCalatorii;

    public CardCalatorie(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }

    @Override
    public void plateste(float pretBilet) {
        if(nrCalatorii>0){
            this.nrCalatorii++;
            System.out.println("Calatorie validata!");
        }else{
            System.out.println("Nu aveti calatorii ramase pe card!");
        }
    }
}
