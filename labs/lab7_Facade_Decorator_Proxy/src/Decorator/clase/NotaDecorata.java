package Decorator.clase;

public abstract class NotaDecorata implements Nota{
    private Nota nota;

    public NotaDecorata(Nota nota) {
        this.nota = nota;
    }

    @Override
    public String printrare() {
        return nota.printrare()+printrareFelicitare();
    }

    protected abstract String printrareFelicitare();
}
