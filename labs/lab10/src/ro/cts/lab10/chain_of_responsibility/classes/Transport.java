package ro.cts.lab10.chain_of_responsibility.classes;

public abstract class Transport {

    protected Transport urmator;
    public void setUrmator(Transport urmator){
        this.urmator=urmator;
    }

    public abstract void recomanda(int dist);
}
