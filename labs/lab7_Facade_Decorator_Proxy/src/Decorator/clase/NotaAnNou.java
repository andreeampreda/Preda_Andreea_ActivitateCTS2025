package Decorator.clase;

public class NotaAnNou extends NotaDecorata{

    public NotaAnNou(Nota nota) {
        super(nota);
    }

    @Override
    protected String printrareFelicitare() {
        return "\t Un An Nou fericit!";
    }
}
