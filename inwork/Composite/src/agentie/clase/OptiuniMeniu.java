package agentie.clase;

public interface OptiuniMeniu {

    void descriere();

    void adaugaNod(OptiuniMeniu op) throws Exception;

    void stergeNod(OptiuniMeniu op) throws Exception;

    OptiuniMeniu getOptiune(int index) throws Exception;

}
