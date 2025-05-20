package Decorator.clase;

public class NotaCraciun extends NotaDecorata{

    public NotaCraciun(Nota nota) {
        super(nota);
    }

    @Override
    protected String printrareFelicitare() {
        return "\t Craciun fericit!";
    }
}
