package ro.cts.lab8.composite.classes;

public interface IStructura {
    void drescriereStructura();

    void adaugaNod(IStructura structura) throws  Exception;
    void stergeNod(IStructura structura) throws Exception;
    IStructura getNodCopil(int index) throws Exception;

}
