package Decorator.clase;

public class NotaPaste extends NotaDecorata{

    public NotaPaste(Nota nota) {
        super(nota);
    }

    @Override
    protected String printrareFelicitare() {
        return "\t Sarbatori luminate!";
    }
}
