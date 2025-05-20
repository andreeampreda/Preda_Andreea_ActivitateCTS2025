package Template.clase;

public class MetrouSpecial extends AMetrou {
    @Override
    public void opresteStatia1() {
        System.out.println("Metroul " +  " opreste statia 1");
    }

    @Override
    public void opresteStatia2() {
        System.out.println("Metroul " + " opreste statia 2");
    }

    @Override
    public void opresteStatia3() {
        System.out.println("Statia 3 este in renovare.");
    }

    @Override
    public void opresteStatia4() {
        System.out.println("Metroul " + " opreste statia 4");
    }

    @Override
    protected void opresteStatia5() {
        System.out.println("Statia 5 este in renovare.");
    }
}
