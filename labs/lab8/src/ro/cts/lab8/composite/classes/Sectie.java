package ro.cts.lab8.composite.classes;

public class Sectie implements IStructura{
    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public void drescriereStructura() {
        System.out.println("Sectia "+nume);
    }

    @Override
    public void adaugaNod(IStructura structura) throws Exception {
            throw new Exception("Nodul este frunza");
    }

    @Override
    public void stergeNod(IStructura structura) throws Exception {
        throw new Exception("Nodul este frunza");
    }

    @Override
    public IStructura getNodCopil(int index) throws Exception{
        throw new Exception("Nodul este frunza");
    }
}
