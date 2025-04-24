package agentie.clase;

public class ProxyPachet implements PachetTuristic{

    private PachetTransport pachetTuristic;

    public ProxyPachet(PachetTransport pachetTuristic) {
        this.pachetTuristic = pachetTuristic;
    }

    public  ProxyPachet(Persoana persoana){
        this.pachetTuristic=new PachetTransport(persoana);
    }

    @Override
    public void rezervarePacher() {
        if(pachetTuristic.getPersoana().getVarsta()>=65){
            pachetTuristic.rezervarePacher();
        }
        else {
            System.out.println("Rezervare nu este permisa.");
        }
    }

    @Override
    public void descriere() {
        pachetTuristic.descriere();
    }
}
