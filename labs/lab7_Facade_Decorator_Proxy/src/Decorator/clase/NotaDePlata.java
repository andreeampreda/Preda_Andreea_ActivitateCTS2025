package Decorator.clase;

public class NotaDePlata implements Nota{
    private float suma;

    public NotaDePlata(float suma) {
        this.suma = suma;
    }

    public float getSuma() {
        return suma;
    }

    @Override
    public String printrare() {
        return "Aveti de achitat "+getSuma() +" lei.";
    }
}
