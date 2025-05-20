package Restaurant.clase;

public class Bar {
    private float pret;
    private boolean areAlcool;

    public Bar(float pret, boolean areAlcool) {
        this.pret = pret;
        this.areAlcool = areAlcool;
    }

    public float getPret() {
        return pret;
    }

    public boolean isAreAlcool() {
        return areAlcool;
    }

    public float calculeazaNota(){
        if(areAlcool)
            return pret*2;
        return pret;
    }
}
