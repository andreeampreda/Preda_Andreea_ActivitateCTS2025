package Template.clase;

public class Metrou extends AMetrou {

    private int nrMetrou;

    public Metrou(int nrMetrou) {
        this.nrMetrou = nrMetrou;
    }

    @Override
    public void opresteStatia1() {
        System.out.println("Metrou " + nrMetrou + " opreste statia 1");
    }

    @Override
    public void opresteStatia2() {
        System.out.println("Metrou " + nrMetrou + " opreste statia 2");
    }

    @Override
    public void opresteStatia3() {
        System.out.println("Metrou " + nrMetrou + " opreste statia 3");
    }

    @Override
    public void opresteStatia4() {
        System.out.println("Metrou " + nrMetrou + " opreste statia 4");
    }

    @Override
    protected void opresteStatia5() {
        System.out.println("Metrou " + nrMetrou + " opreste statia 5");
    }
}
