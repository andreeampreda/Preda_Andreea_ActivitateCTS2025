package Chain_of_responsibility.clase;

public abstract class Transport {
    protected Transport urmator;

    public Transport(){

    }

    public void setUrmator(Transport urmator){
        this.urmator=urmator;
    }

    public abstract void recomanda(int dist);
}
